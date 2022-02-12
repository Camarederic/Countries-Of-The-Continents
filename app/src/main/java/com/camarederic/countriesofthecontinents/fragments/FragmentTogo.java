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


public class FragmentTogo extends Fragment {

    public static FragmentTogo newInstance() {
        return new FragmentTogo();
    }

    private ImageView imageViewTogo;
    private ProgressBar progressBarTogo;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_togo, container, false);

        imageViewTogo = view.findViewById(R.id.imageViewTogo);
        progressBarTogo = view.findViewById(R.id.progressBarTogo);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-togo_1401-240.jpg")
                .into(imageViewTogo, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarTogo.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarTogo.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}