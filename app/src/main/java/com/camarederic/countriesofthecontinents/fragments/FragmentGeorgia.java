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


public class FragmentGeorgia extends Fragment {


    public static FragmentGeorgia newInstance(){
        return new FragmentGeorgia();
    }

    private ImageView imageViewGeorgia;
    private ProgressBar progressBarGeorgia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_georgia, container, false);

        imageViewGeorgia = view.findViewById(R.id.imageViewGeorgia);
        progressBarGeorgia = view.findViewById(R.id.progressBarGeorgia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-georgia_1401-117.jpg")
                .into(imageViewGeorgia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarGeorgia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarGeorgia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}