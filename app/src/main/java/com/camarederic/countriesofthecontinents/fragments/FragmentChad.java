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


public class FragmentChad extends Fragment {

    public static FragmentChad newInstance(){
        return new FragmentChad();
    }

    private ImageView imageViewChad;
    private ProgressBar progressBarChad;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_chad, container, false);

        imageViewChad = view.findViewById(R.id.imageViewChad);
        progressBarChad = view.findViewById(R.id.progressBarChad);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-chad_1401-87.jpg")
                .into(imageViewChad, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarChad.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarChad.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}