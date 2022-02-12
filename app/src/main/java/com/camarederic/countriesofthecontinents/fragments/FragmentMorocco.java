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


public class FragmentMorocco extends Fragment {

    public static FragmentMorocco newInstance() {
        return new FragmentMorocco();
    }

    private ImageView imageViewMorocco;
    private ProgressBar progressBarMorocco;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_morocco, container, false);

        imageViewMorocco = view.findViewById(R.id.imageViewMorocco);
        progressBarMorocco = view.findViewById(R.id.progressBarMorocco);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-morocco_1401-177.jpg")
                .into(imageViewMorocco, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarMorocco.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMorocco.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}