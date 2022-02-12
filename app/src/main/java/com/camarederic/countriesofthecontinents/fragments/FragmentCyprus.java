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


public class FragmentCyprus extends Fragment {


    public static FragmentCyprus newInstance(){
        return new FragmentCyprus();
    }

    private ImageView imageViewCyprus;
    private ProgressBar progressBarCyprus;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cyprus, container, false);

        imageViewCyprus = view.findViewById(R.id.imageViewCyprus);
        progressBarCyprus = view.findViewById(R.id.progressBarCyprus);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-cyprus_1401-97.jpg")
                .into(imageViewCyprus, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarCyprus.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarCyprus.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}