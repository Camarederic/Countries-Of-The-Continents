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


public class FragmentTaiwan extends Fragment {


    public static FragmentTaiwan newInstance(){
        return new FragmentTaiwan();
    }

    private ImageView imageViewTaiwan;
    private ProgressBar progressBarTaiwan;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_taiwan,container,false);

        imageViewTaiwan = view.findViewById(R.id.imageViewTaiwan);
        progressBarTaiwan = view.findViewById(R.id.progressBarTaiwan);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-taiwan_1401-262.jpg")
                .into(imageViewTaiwan, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarTaiwan.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarTaiwan.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}