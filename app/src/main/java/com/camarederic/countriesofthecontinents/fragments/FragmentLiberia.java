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


public class FragmentLiberia extends Fragment {

    public static FragmentLiberia newInstance() {
        return new FragmentLiberia();
    }

    private ImageView imageViewLiberia;
    private ProgressBar progressBarLiberia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_liberia, container, false);

        imageViewLiberia = view.findViewById(R.id.imageViewLiberia);
        progressBarLiberia = view.findViewById(R.id.progressBarLiberia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-liberia_1401-155.jpg")
                .into(imageViewLiberia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarLiberia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarLiberia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}