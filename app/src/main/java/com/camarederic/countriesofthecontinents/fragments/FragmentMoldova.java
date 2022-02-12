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


public class FragmentMoldova extends Fragment {

    public static FragmentMoldova newInstance() {
        return new FragmentMoldova();
    }

    private ImageView imageViewMoldova;
    private ProgressBar progressBarMoldova;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_moldova, container, false);

        imageViewMoldova = view.findViewById(R.id.imageViewMoldova);
        progressBarMoldova = view.findViewById(R.id.progressBarMoldova);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-moldova_1401-173.jpg")
                .into(imageViewMoldova, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarMoldova.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMoldova.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}