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


public class FragmentPhilippines extends Fragment {


    public static FragmentPhilippines newInstance() {
        return new FragmentPhilippines();
    }

    private ImageView imageViewPhilippines;
    private ProgressBar progressBarPhilippines;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_philippines, container, false);

        imageViewPhilippines = view.findViewById(R.id.imageViewPhilippines);
        progressBarPhilippines = view.findViewById(R.id.progressBarPhilippines);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-philippines_1401-199.jpg")
                .into(imageViewPhilippines, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarPhilippines.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarPhilippines.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}