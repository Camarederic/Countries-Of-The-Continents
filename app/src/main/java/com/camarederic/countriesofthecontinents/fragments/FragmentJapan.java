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


public class FragmentJapan extends Fragment {

    public static FragmentJapan newInstance() {
        return new FragmentJapan();
    }

    private ImageView imageViewJapan;
    private ProgressBar progressBarJapan;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_japan, container, false);

        imageViewJapan = view.findViewById(R.id.imageViewJapan);
        progressBarJapan = view.findViewById(R.id.progressBarJapan);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-japan_1401-141.jpg")
                .into(imageViewJapan, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarJapan.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarJapan.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}