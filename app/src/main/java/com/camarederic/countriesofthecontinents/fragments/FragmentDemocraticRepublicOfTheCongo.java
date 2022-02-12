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


public class FragmentDemocraticRepublicOfTheCongo extends Fragment {

    public static FragmentDemocraticRepublicOfTheCongo newInstance(){
        return new FragmentDemocraticRepublicOfTheCongo();
    }

    private ImageView imageViewDemocraticRepublicOfTheCongo;
    private ProgressBar progressBarDemocraticRepublicOfTheCongo;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_democratic_republic_of_the_congo, container, false);

        imageViewDemocraticRepublicOfTheCongo = view.findViewById(R.id.imageViewDemocraticRepublicOfTheCongo);
        progressBarDemocraticRepublicOfTheCongo = view.findViewById(R.id.progressBarDemocraticRepublicOfTheCongo);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-democratic-republic-of-the-congo_1401-92.jpg")
                .into(imageViewDemocraticRepublicOfTheCongo, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarDemocraticRepublicOfTheCongo.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarDemocraticRepublicOfTheCongo.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}