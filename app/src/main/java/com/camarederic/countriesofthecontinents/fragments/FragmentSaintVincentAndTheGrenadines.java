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


public class FragmentSaintVincentAndTheGrenadines extends Fragment {

    public static FragmentSaintVincentAndTheGrenadines newInstance() {
        return new FragmentSaintVincentAndTheGrenadines();
    }

    private ImageView imageViewSaintVincentAndTheGrenadines;
    private ProgressBar progressBarSaintVincentAndTheGrenadines;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_saint_vincent_and_the_grenadines, container, false);

        imageViewSaintVincentAndTheGrenadines = view.findViewById(R.id.imageViewSaintVincentAndTheGrenadines);
        progressBarSaintVincentAndTheGrenadines = view.findViewById(R.id.progressBarSaintVincentAndTheGrenadines);

        Picasso.get().load("https://www.slon.pics/file/2016/12/Flag-of-Saint-Vincent-and-the-Grenadines-19607.jpg")
                .into(imageViewSaintVincentAndTheGrenadines, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSaintVincentAndTheGrenadines.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSaintVincentAndTheGrenadines.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}