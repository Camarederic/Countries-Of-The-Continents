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


public class FragmentSaintLucia extends Fragment {

    public static FragmentSaintLucia newInstance() {
        return new FragmentSaintLucia();
    }

    private ImageView imageViewSaintLucia;
    private ProgressBar progressBarSaintLucia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_saint_lucia, container, false);

        imageViewSaintLucia = view.findViewById(R.id.imageViewSaintLucia);
        progressBarSaintLucia = view.findViewById(R.id.progressBarSaintLucia);

        Picasso.get().load("https://img.freepik.com/free-photo/" +
                "flag-of-saint-lucia_1401-210.jpg?size=626&ext=jpg&ga=GA1.2.1365916148.1638057600")
                .into(imageViewSaintLucia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSaintLucia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSaintLucia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}