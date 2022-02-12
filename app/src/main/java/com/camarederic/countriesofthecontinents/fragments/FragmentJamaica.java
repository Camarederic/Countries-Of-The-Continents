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

public class FragmentJamaica extends Fragment {

    public static FragmentJamaica newInstance() {
        return new FragmentJamaica();
    }

    private ImageView imageViewJamaica;
    private ProgressBar progressBarJamaica;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_jamaica, container, false);

        imageViewJamaica = view.findViewById(R.id.imageViewJamaica);
        progressBarJamaica = view.findViewById(R.id.progressBarJamaica);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-jamaica_1401-140.jpg")
                .into(imageViewJamaica, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarJamaica.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarJamaica.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}