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


public class FragmentGuatemala extends Fragment {

    public static FragmentGuatemala newInstance() {
        return new FragmentGuatemala();
    }

    private ImageView imageViewGuatemala;
    private ProgressBar progressBarGuatemala;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_guatemala, container, false);

        imageViewGuatemala = view.findViewById(R.id.imageViewGuatemala);
        progressBarGuatemala = view.findViewById(R.id.progressBarGuatemala);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-guatemala_1401-123.jpg")
                .into(imageViewGuatemala, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarGuatemala.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarGuatemala.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}