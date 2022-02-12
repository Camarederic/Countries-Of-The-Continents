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


public class FragmentGhana extends Fragment {

    public static FragmentGhana newInstance(){
        return new FragmentGhana();
    }

    private ImageView imageViewGhana;
    private ProgressBar progressBarGhana;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ghana, container, false);

        imageViewGhana = view.findViewById(R.id.imageViewGhana);
        progressBarGhana = view.findViewById(R.id.progressBarGhana);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-ghana_1401-120.jpg")
                .into(imageViewGhana, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarGhana.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarGhana.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}