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

import com.camarederic.countriesofthecontinents.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;


public class FragmentVanuatu extends Fragment {


    public static FragmentVanuatu newInstance() {
        return new FragmentVanuatu();
    }

    private ImageView imageViewVanuatu;
    private ProgressBar progressBarVanuatu;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_vanuatu, container, false);

        imageViewVanuatu = view.findViewById(R.id.imageViewVanuatu);
        progressBarVanuatu = view.findViewById(R.id.progressBarVanuatu);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-vanuatu_1401-256.jpg")
                .into(imageViewVanuatu, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarVanuatu.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        progressBarVanuatu.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}