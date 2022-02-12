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


public class FragmentSamoa extends Fragment {

    public static FragmentSamoa newInstance() {
        return new FragmentSamoa();
    }

    private ImageView imageViewSamoa;
    private ProgressBar progressBarSamoa;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_samoa, container, false);

        imageViewSamoa = view.findViewById(R.id.imageViewSamoa);
        progressBarSamoa = view.findViewById(R.id.progressBarSamoa);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-samoa_1401-212.jpg")
                .into(imageViewSamoa, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarSamoa.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSamoa.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}