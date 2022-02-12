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


public class FragmentMalaysia extends Fragment {


    public static FragmentMalaysia newInstance() {
        return new FragmentMalaysia();
    }

    private ImageView imageViewMalaysia;
    private ProgressBar progressBarMalaysia;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_malaysia, container, false);

        imageViewMalaysia = view.findViewById(R.id.imageViewMalaysia);
        progressBarMalaysia = view.findViewById(R.id.progressBarMalaysia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-malaysia_1401-164.jpg")
                .into(imageViewMalaysia, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarMalaysia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMalaysia.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}