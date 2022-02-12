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


public class FragmentAruba extends Fragment {

    public static FragmentAruba newInstance(){
        return new FragmentAruba();
    }

    private ImageView imageViewAruba;
    private ProgressBar progressBarAruba;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_aruba, container, false);

        imageViewAruba = view.findViewById(R.id.imageViewAruba);
        progressBarAruba = view.findViewById(R.id.progressBarAruba);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-aruba_1401-275.jpg")
                .into(imageViewAruba, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarAruba.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarAruba.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}