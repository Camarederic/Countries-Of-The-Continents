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


public class FragmentHaiti extends Fragment {

    public static FragmentHaiti newInstance() {
        return new FragmentHaiti();
    }

    private ImageView imageViewHaiti;
    private ProgressBar progressBarHaiti;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_haiti, container, false);

        imageViewHaiti = view.findViewById(R.id.imageViewHaiti);
        progressBarHaiti = view.findViewById(R.id.progressBarHaiti);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-guatemala_1401-123.jpg")
                .into(imageViewHaiti, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarHaiti.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarHaiti.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}