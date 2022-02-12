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


public class FragmentRomania extends Fragment {

    public static FragmentRomania newInstance() {
        return new FragmentRomania();
    }

    private ImageView imageViewRomania;
    private ProgressBar progressBarRomania;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_romania, container, false);

        imageViewRomania = view.findViewById(R.id.imageViewRomania);
        progressBarRomania = view.findViewById(R.id.progressBarRomania);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-romania_1401-204.jpg")
                .into(imageViewRomania, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarRomania.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarRomania.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}