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


public class FragmentPalau extends Fragment {


    public static FragmentPalau newInstance() {
        return new FragmentPalau();
    }

    private ImageView imageViewPalau;
    private ProgressBar progressBarPalau;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_palau, container, false);

        imageViewPalau = view.findViewById(R.id.imageViewPalau);
        progressBarPalau = view.findViewById(R.id.progressBarPalau);

        Picasso.get().load("https://image.freepik.com/photos-gratuite/drapeau-palau_1401-193.jpg")
                .into(imageViewPalau, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarPalau.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarPalau.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}