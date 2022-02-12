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


public class FragmentSintMaarten extends Fragment {

    public static FragmentSintMaarten newInstance() {
        return new FragmentSintMaarten();
    }

    private ImageView imageViewSintMaarten;
    private ProgressBar progressBarSintMaarten;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sint_maarten, container, false);

        imageViewSintMaarten = view.findViewById(R.id.imageViewSintMaarten);
        progressBarSintMaarten = view.findViewById(R.id.progressBarSintMaarten);

        Picasso.get().load("https://static.officeholidays.com/images/300x189c/sint-maarten-flag-01.jpg")
                .into(imageViewSintMaarten, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSintMaarten.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSintMaarten.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}