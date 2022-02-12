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


public class FragmentSintEustatius extends Fragment {

    public static FragmentSintEustatius newInstance() {
        return new FragmentSintEustatius();
    }

    private ImageView imageViewSintEustatius;
    private ProgressBar progressBarSintEustatius;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sint_eustatius, container, false);

        imageViewSintEustatius = view.findViewById(R.id.imageViewSintEustatius);
        progressBarSintEustatius = view.findViewById(R.id.progressBarSintEustatius);

        Picasso.get().load("https://static.officeholidays.com/images/935x475c/sint-eustatius-flag-01.jpg")
                .into(imageViewSintEustatius, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSintEustatius.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSintEustatius.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}