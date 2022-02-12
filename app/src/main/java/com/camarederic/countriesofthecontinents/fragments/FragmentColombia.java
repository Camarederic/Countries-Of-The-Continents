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


public class FragmentColombia extends Fragment {

    public static FragmentColombia newInstance(){
        return new FragmentColombia();
    }

    private ImageView imageViewColombia;
    private ProgressBar progressBarColombia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_colombia, container, false);

        imageViewColombia = view.findViewById(R.id.imageViewColombia);
        progressBarColombia = view.findViewById(R.id.progressBarColombia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-colombia_1401-90.jpg")
                .into(imageViewColombia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarColombia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarColombia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}