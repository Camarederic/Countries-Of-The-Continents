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


public class FragmentVaticanCity extends Fragment {

    public static FragmentVaticanCity newInstance() {
        return new FragmentVaticanCity();
    }

    private ImageView imageViewVaticanCity;
    private ProgressBar progressBarVaticanCity;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_vatican_city, container, false);

        imageViewVaticanCity = view.findViewById(R.id.imageViewVaticanCity);
        progressBarVaticanCity = view.findViewById(R.id.progressBarVaticanCity);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-the-vatican-city_1401-257.jpg")
                .into(imageViewVaticanCity, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarVaticanCity.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarVaticanCity.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}