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


public class FragmentGambia extends Fragment {

    public static FragmentGambia newInstance(){
        return new FragmentGambia();
    }

    private ImageView imageViewGambia;
    private ProgressBar progressBarGambia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gambia, container, false);

        imageViewGambia = view.findViewById(R.id.imageViewGambia);
        progressBarGambia = view.findViewById(R.id.progressBarGambia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-gambia_1401-116.jpg")
                .into(imageViewGambia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarGambia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarGambia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}