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


public class FragmentSouthAfrica extends Fragment {

    public static FragmentSouthAfrica newInstance() {
        return new FragmentSouthAfrica();
    }

    private ImageView imageViewSouthAfrica;
    private ProgressBar progressBarSouthAfrica;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_south_africa, container, false);

        imageViewSouthAfrica = view.findViewById(R.id.imageViewSouthAfrica);
        progressBarSouthAfrica = view.findViewById(R.id.progressBarSouthAfrica);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-the-republic-of-south-africa_1401-226.jpg")
                .into(imageViewSouthAfrica, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSouthAfrica.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSouthAfrica.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}