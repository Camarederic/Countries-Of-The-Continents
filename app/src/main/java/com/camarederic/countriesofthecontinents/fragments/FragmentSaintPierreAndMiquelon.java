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


public class FragmentSaintPierreAndMiquelon extends Fragment {

    public static FragmentSaintPierreAndMiquelon newInstance() {
        return new FragmentSaintPierreAndMiquelon();
    }

    private ImageView imageViewSaintPierreAndMiquelon;
    private ProgressBar progressBarSaintPierreAndMiquelon;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_saint_pierre_and_miquelon, container, false);

        imageViewSaintPierreAndMiquelon = view.findViewById(R.id.imageViewSaintPierreAndMiquelon);
        progressBarSaintPierreAndMiquelon = view.findViewById(R.id.progressBarSaintPierreAndMiquelon);

        Picasso.get().load("https://www.estudopratico.com.br/wp-content/uploads/2017/01/" +
                "significado-da-bandeira-de-saint-pierre-e-miquelon.jpg")
                .into(imageViewSaintPierreAndMiquelon, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSaintPierreAndMiquelon.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSaintPierreAndMiquelon.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}