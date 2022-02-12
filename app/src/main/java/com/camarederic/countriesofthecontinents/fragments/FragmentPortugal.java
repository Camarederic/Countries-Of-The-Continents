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


public class FragmentPortugal extends Fragment {

    public static FragmentPortugal newInstance() {
        return new FragmentPortugal();
    }

    private ImageView imageViewPortugal;
    private ProgressBar progressBarPortugal;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_portugal, container, false);

        imageViewPortugal = view.findViewById(R.id.imageViewPortugal);
        progressBarPortugal = view.findViewById(R.id.progressBarPortugal);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-portugal_1401-202.jpg")
                .into(imageViewPortugal, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarPortugal.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarPortugal.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}