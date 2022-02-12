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


public class FragmentSaintMartin extends Fragment {

    public static FragmentSaintMartin newInstance() {
        return new FragmentSaintMartin();
    }

    private ImageView imageViewSaintMartin;
    private ProgressBar progressBarSaintMartin;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_saint_martin, container, false);

        imageViewSaintMartin = view.findViewById(R.id.imageViewSaintMartin);
        progressBarSaintMartin = view.findViewById(R.id.progressBarSaintMartin);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/" +
                "Flag_of_Saint-Martin_%28fictional%29.svg/1280px-Flag_of_Saint-Martin_%28fictional%29.svg.png")
                .into(imageViewSaintMartin, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSaintMartin.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSaintMartin.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}