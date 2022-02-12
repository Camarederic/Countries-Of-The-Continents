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


public class FragmentZambia extends Fragment {

    public static FragmentZambia newInstance() {
        return new FragmentZambia();
    }

    private ImageView imageViewZambia;
    private ProgressBar progressBarZambia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_zambia, container, false);

        imageViewZambia = view.findViewById(R.id.imageViewZambia);
        progressBarZambia = view.findViewById(R.id.progressBarZambia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-zambia_1401-260.jpg")
                .into(imageViewZambia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarZambia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarZambia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}