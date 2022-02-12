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


public class FragmentPakistan extends Fragment {


    public static FragmentPakistan newInstance() {
        return new FragmentPakistan();
    }

    private ImageView imageViewPakistan;
    private ProgressBar progressBarPakistan;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pakistan, container, false);

        imageViewPakistan = view.findViewById(R.id.imageViewPakistan);
        progressBarPakistan = view.findViewById(R.id.progressBarPakistan);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-pakistan_1401-192.jpg")
                .into(imageViewPakistan, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarPakistan.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarPakistan.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}