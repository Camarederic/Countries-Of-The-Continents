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


public class FragmentRepublicOfTheCongo extends Fragment {

    public static FragmentRepublicOfTheCongo newInstance() {
        return new FragmentRepublicOfTheCongo();
    }

    private ImageView imageViewRepublicOfTheCongo;
    private ProgressBar progressBarRepublicOfTheCongo;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_republic_of_the_congo, container, false);

        imageViewRepublicOfTheCongo = view.findViewById(R.id.imageViewRepublicOfTheCongo);
        progressBarRepublicOfTheCongo = view.findViewById(R.id.progressBarRepublicOfTheCongo);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-republic-of-the-congo_1401-93.jpg")
                .into(imageViewRepublicOfTheCongo, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarRepublicOfTheCongo.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarRepublicOfTheCongo.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}