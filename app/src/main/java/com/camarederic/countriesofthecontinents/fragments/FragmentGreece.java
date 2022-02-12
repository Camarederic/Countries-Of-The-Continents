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


public class FragmentGreece extends Fragment {

    public static FragmentGreece newInstance() {
        return new FragmentGreece();
    }

    private ImageView imageViewGreece;
    private ProgressBar progressBarGreece;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_greece, container, false);

        imageViewGreece = view.findViewById(R.id.imageViewGreece);
        progressBarGreece = view.findViewById(R.id.progressBarGreece);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-greece_1401-121.jpg")
                .into(imageViewGreece, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarGreece.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarGreece.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}