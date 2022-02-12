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


public class FragmentSaudiArabia extends Fragment {


    public static FragmentSaudiArabia newInstance(){
        return new FragmentSaudiArabia();
    }

    private ImageView imageViewSaudiArabia;
    private ProgressBar progressBarSaudiArabia;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_saudi_arabia,container,false);

        imageViewSaudiArabia = view.findViewById(R.id.imageViewSaudiArabia);
        progressBarSaudiArabia = view.findViewById(R.id.progressBarSaudiArabia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-saudi-arabia_1401-215.jpg")
                .into(imageViewSaudiArabia, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarSaudiArabia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSaudiArabia.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}