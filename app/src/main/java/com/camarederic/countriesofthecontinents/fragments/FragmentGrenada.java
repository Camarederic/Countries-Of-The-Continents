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


public class FragmentGrenada extends Fragment {

    public static FragmentGrenada newInstance() {
        return new FragmentGrenada();
    }

    private ImageView imageViewGrenada;
    private ProgressBar progressBarGrenada;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_grenada, container, false);

        imageViewGrenada = view.findViewById(R.id.imageViewGrenada);
        progressBarGrenada = view.findViewById(R.id.progressBarGrenada);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-grenada-silk-close-up-background_406939-165.jpg")
                .into(imageViewGrenada, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarGrenada.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarGrenada.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}