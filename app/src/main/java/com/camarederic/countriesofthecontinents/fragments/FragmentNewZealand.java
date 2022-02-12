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


public class FragmentNewZealand extends Fragment {


    public static FragmentNewZealand newInstance() {
        return new FragmentNewZealand();
    }

    private ImageView imageViewNewZealand;
    private ProgressBar progressBarNewZealand;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_new_zealand, container, false);

        imageViewNewZealand = view.findViewById(R.id.imageViewNewZealand);
        progressBarNewZealand = view.findViewById(R.id.progressBarNewZealand);

        Picasso.get().load("https://newzealandlife.ru/wp-content/uploads/2018/08/flag1.jpg")
                .into(imageViewNewZealand, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarNewZealand.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarNewZealand.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}