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


public class FragmentKiribati extends Fragment {


    public static FragmentKiribati newInstance() {
        return new FragmentKiribati();
    }

    private ImageView imageViewKiribati;
    private ProgressBar progressBarKiribati;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_kiribati, container, false);

        imageViewKiribati = view.findViewById(R.id.imageViewKiribati);
        progressBarKiribati = view.findViewById(R.id.progressBarKiribati);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-kiribati_1401-146.jpg")
                .into(imageViewKiribati, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarKiribati.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarKiribati.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}