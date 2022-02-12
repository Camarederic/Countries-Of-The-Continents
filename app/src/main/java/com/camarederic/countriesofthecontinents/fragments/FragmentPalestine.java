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


public class FragmentPalestine extends Fragment {


    public static FragmentPalestine newInstance() {
        return new FragmentPalestine();
    }

    private ImageView imageViewPalestine;
    private ProgressBar progressBarPalestine;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_palestine, container, false);

        imageViewPalestine = view.findViewById(R.id.imageViewPalestine);
        progressBarPalestine = view.findViewById(R.id.progressBarPalestine);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-palestine_1401-279.jpg")
                .into(imageViewPalestine, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarPalestine.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarPalestine.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}