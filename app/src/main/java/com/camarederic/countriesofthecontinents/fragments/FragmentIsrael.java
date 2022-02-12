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


public class FragmentIsrael extends Fragment {


    public static FragmentIsrael newInstance() {
        return new FragmentIsrael();
    }

    private ImageView imageViewIsrael;
    private ProgressBar progressBarIsrael;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_israel, container, false);

        imageViewIsrael = view.findViewById(R.id.imageViewIsrael);
        progressBarIsrael = view.findViewById(R.id.progressBarIsrael);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-israel_1401-139.jpg")
                .into(imageViewIsrael, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarIsrael.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarIsrael.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}