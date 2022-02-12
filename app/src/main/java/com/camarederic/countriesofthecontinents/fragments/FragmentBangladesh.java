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


public class FragmentBangladesh extends Fragment {

    public static FragmentBangladesh newInstance(){
        return new FragmentBangladesh();
    }


    private ImageView imageViewBangladesh;
    private ProgressBar progressBarBangladesh;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bangladesh, container, false);

        imageViewBangladesh = view.findViewById(R.id.imageViewBangladesh);
        progressBarBangladesh = view.findViewById(R.id.progressBarBangladesh);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-bangladesh_1401-65.jpg")
                .into(imageViewBangladesh, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarBangladesh.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBangladesh.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}