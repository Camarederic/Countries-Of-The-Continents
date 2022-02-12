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


public class FragmentGreenland extends Fragment {

    public static FragmentGreenland newInstance() {
        return new FragmentGreenland();
    }

    private ImageView imageViewGreenland;
    private ProgressBar progressBarGreenland;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_greenland, container, false);

        imageViewGreenland = view.findViewById(R.id.imageViewGreenland);
        progressBarGreenland = view.findViewById(R.id.progressBarGreenland);

        Picasso.get().load("https://cs10.pikabu.ru/images/big_size_comm/2019-06_1/1559552557160636627.jpg")
                .into(imageViewGreenland, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarGreenland.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarGreenland.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}