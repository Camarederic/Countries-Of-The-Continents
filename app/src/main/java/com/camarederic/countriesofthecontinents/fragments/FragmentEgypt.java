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


public class FragmentEgypt extends Fragment {


    public static FragmentEgypt newInstance(){
        return new FragmentEgypt();
    }

    private ImageView imageViewEgypt;
    private ProgressBar progressBarEgypt;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_egypt, container, false);

        imageViewEgypt = view.findViewById(R.id.imageViewEgypt);
        progressBarEgypt = view.findViewById(R.id.progressBarEgypt);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-egypt_1401-105.jpg")
                .into(imageViewEgypt, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarEgypt.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarEgypt.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}