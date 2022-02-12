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


public class FragmentMongolia extends Fragment {


    public static FragmentMongolia newInstance() {
        return new FragmentMongolia();
    }

    private ImageView imageViewMongolia;
    private ProgressBar progressBarMongolia;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mongolia, container, false);

        imageViewMongolia = view.findViewById(R.id.imageViewMongolia);
        progressBarMongolia = view.findViewById(R.id.progressBarMongolia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-mongolia_1401-175.jpg")
                .into(imageViewMongolia, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarMongolia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMongolia.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}