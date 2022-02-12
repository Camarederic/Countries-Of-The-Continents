package com.camarederic.countriesofthecontinents.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.camarederic.countriesofthecontinents.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;


public class FragmentGabon extends Fragment {

    public static FragmentGabon newInstance(){
        return new FragmentGabon();
    }

    private ImageView imageViewGabon;
    private ProgressBar progressBarGabon;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gabon, container, false);

        imageViewGabon = view.findViewById(R.id.imageViewGabon);
        progressBarGabon = view.findViewById(R.id.progressBarGabon);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-gabon_1401-115.jpg")
                .into(imageViewGabon, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarGabon.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarGabon.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}