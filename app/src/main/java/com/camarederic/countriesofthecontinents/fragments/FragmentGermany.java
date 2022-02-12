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


public class FragmentGermany extends Fragment {

    public static FragmentGermany newInstance(){
        return new FragmentGermany();
    }

    private ImageView imageViewGermany;
    private ProgressBar progressBarGermany;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_germany, container, false);

        imageViewGermany = view.findViewById(R.id.imageViewGermany);
        progressBarGermany = view.findViewById(R.id.progressBarGermany);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-germany_1401-118.jpg")
                .into(imageViewGermany, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarGermany.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarGermany.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}