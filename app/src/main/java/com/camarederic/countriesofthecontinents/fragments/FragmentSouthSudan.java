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


public class FragmentSouthSudan extends Fragment {

    public static FragmentSouthSudan newInstance() {
        return new FragmentSouthSudan();
    }

    private ImageView imageViewSouthSudan;
    private ProgressBar progressBarSouthSudan;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_south_sudan, container, false);

        imageViewSouthSudan = view.findViewById(R.id.imageViewSouthSudan);
        progressBarSouthSudan = view.findViewById(R.id.progressBarSouthSudan);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-south-sudan_1401-227.jpg")
                .into(imageViewSouthSudan, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSouthSudan.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSouthSudan.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}