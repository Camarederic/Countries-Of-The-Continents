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


public class FragmentTrinidadAndTobago extends Fragment {

    public static FragmentTrinidadAndTobago newInstance() {
        return new FragmentTrinidadAndTobago();
    }

    private ImageView imageViewTrinidadAndTobago;
    private ProgressBar progressBarTrinidadAndTobago;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_trinidad_and_tobago, container, false);

        imageViewTrinidadAndTobago = view.findViewById(R.id.imageViewTrinidadAndTobago);
        progressBarTrinidadAndTobago = view.findViewById(R.id.progressBarTrinidadAndTobago);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-trinidad-and-tobago_1401-242.jpg")
                .into(imageViewTrinidadAndTobago, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarTrinidadAndTobago.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarTrinidadAndTobago.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}