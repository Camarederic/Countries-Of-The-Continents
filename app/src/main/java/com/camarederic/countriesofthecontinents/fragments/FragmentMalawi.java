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


public class FragmentMalawi extends Fragment {

    public static FragmentMalawi newInstance() {
        return new FragmentMalawi();
    }

    private ImageView imageViewMalawi;
    private ProgressBar progressBarMalawi;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_malawi, container, false);

        imageViewMalawi = view.findViewById(R.id.imageViewMalawi);
        progressBarMalawi = view.findViewById(R.id.progressBarMalawi);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-malawi_1401-163.jpg")
                .into(imageViewMalawi, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarMalawi.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMalawi.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}