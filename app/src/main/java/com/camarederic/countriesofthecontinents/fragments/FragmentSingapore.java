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


public class FragmentSingapore extends Fragment {


    public static FragmentSingapore newInstance() {
        return new FragmentSingapore();
    }

    private ImageView imageViewSingapore;
    private ProgressBar progressBarSingapore;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_singapore, container, false);

        imageViewSingapore = view.findViewById(R.id.imageViewSingapore);
        progressBarSingapore = view.findViewById(R.id.progressBarSingapore);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-singapore_1401-220.jpg")
                .into(imageViewSingapore, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarSingapore.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSingapore.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}