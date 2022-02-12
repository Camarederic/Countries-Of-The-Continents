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


public class FragmentSaintKittsAndNevis extends Fragment {

    public static FragmentSaintKittsAndNevis newInstance() {
        return new FragmentSaintKittsAndNevis();
    }

    private ImageView imageViewSaintKittsAndNevis;
    private ProgressBar progressBarSaintKittsAndNevis;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_saint_kitts_and_nevis, container, false);

        imageViewSaintKittsAndNevis = view.findViewById(R.id.imageViewSaintKittsAndNevis);
        progressBarSaintKittsAndNevis = view.findViewById(R.id.progressBarSaintKittsAndNevis);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-saint-kitts-nevis_1401-209.jpg")
                .into(imageViewSaintKittsAndNevis, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSaintKittsAndNevis.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSaintKittsAndNevis.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}