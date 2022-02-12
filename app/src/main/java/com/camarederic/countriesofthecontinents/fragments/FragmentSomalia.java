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


public class FragmentSomalia extends Fragment {

    public static FragmentSomalia newInstance() {
        return new FragmentSomalia();
    }

    private ImageView imageViewSomalia;
    private ProgressBar progressBarSomalia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_somalia, container, false);

        imageViewSomalia = view.findViewById(R.id.imageViewSomalia);
        progressBarSomalia = view.findViewById(R.id.progressBarSomalia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-somalia_1401-225.jpg")
                .into(imageViewSomalia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSomalia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSomalia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}