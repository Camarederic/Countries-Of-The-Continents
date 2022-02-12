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


public class FragmentTurksAndCaicosIslands extends Fragment {

    public static FragmentTurksAndCaicosIslands newInstance() {
        return new FragmentTurksAndCaicosIslands();
    }

    private ImageView imageViewTurksAndCaicosIslands;
    private ProgressBar progressBarTurksAndCaicosIslands;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_turks_and_caicos_islands, container, false);

        imageViewTurksAndCaicosIslands = view.findViewById(R.id.imageViewTurksAndCaicosIslands);
        progressBarTurksAndCaicosIslands = view.findViewById(R.id.progressBarTurksAndCaicosIslands);

        Picasso.get().load("https://ak.picdn.net/shutterstock/videos/24098182/thumb/1.jpg")
                .into(imageViewTurksAndCaicosIslands, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarTurksAndCaicosIslands.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarTurksAndCaicosIslands.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}