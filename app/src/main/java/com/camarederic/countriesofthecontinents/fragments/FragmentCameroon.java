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


public class FragmentCameroon extends Fragment {

    public static FragmentCameroon newInstance(){
        return new FragmentCameroon();
    }

    private ImageView imageViewCameroon;
    private ProgressBar progressBarCameroon;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cameroon, container, false);

        imageViewCameroon = view.findViewById(R.id.imageViewCameroon);
        progressBarCameroon = view.findViewById(R.id.progressBarCameroon);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-cameroon_1401-83.jpg")
                .into(imageViewCameroon, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarCameroon.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarCameroon.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}