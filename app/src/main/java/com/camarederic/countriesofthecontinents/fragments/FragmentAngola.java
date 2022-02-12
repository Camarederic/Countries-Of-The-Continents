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


public class FragmentAngola extends Fragment {

    public static FragmentAngola newInstance(){
        return new FragmentAngola();
    }

    private ImageView imageViewAngola;
    private ProgressBar progressBarAngola;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_angola, container, false);

        imageViewAngola = view.findViewById(R.id.imageViewAngola);
        progressBarAngola = view.findViewById(R.id.progressBarAngola);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-angola_1401-54.jpg")
                .into(imageViewAngola, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarAngola.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarAngola.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}