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


public class FragmentNetherlands extends Fragment {

    public static FragmentNetherlands newInstance() {
        return new FragmentNetherlands();
    }

    private ImageView imageViewNetherlands;
    private ProgressBar progressBarNetherlands;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_netherlands, container, false);

        imageViewNetherlands = view.findViewById(R.id.imageViewNetherlands);
        progressBarNetherlands = view.findViewById(R.id.progressBarNetherlands);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-netherlands_1401-183.jpg")
                .into(imageViewNetherlands, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarNetherlands.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarNetherlands.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}