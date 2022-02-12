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


public class FragmentSenegal extends Fragment {

    public static FragmentSenegal newInstance() {
        return new FragmentSenegal();
    }

    private ImageView imageViewSenegal;
    private ProgressBar progressBarSenegal;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_senegal, container, false);

        imageViewSenegal = view.findViewById(R.id.imageViewSenegal);
        progressBarSenegal = view.findViewById(R.id.progressBarSenegal);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-senegal_1401-216.jpg")
                .into(imageViewSenegal, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSenegal.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSenegal.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}