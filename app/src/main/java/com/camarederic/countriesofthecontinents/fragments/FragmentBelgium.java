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


public class FragmentBelgium extends Fragment {

    public static FragmentBelgium newInstance(){
        return new FragmentBelgium();
    }

    private ImageView imageViewBelgium;
    private ProgressBar progressBarBelgium;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_belgium, container, false);

        imageViewBelgium = view.findViewById(R.id.imageViewBelgium);
        progressBarBelgium = view.findViewById(R.id.progressBarBelgium);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-belgium_1401-68.jpg")
                .into(imageViewBelgium, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarBelgium.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBelgium.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}