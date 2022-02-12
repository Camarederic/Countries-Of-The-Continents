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


public class FragmentArgentina extends Fragment {

    public static FragmentArgentina newInstance(){
        return new FragmentArgentina();
    }

    private ImageView imageViewArgentina;
    private ProgressBar progressBarArgentina;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_argentina, container, false);

        imageViewArgentina = view.findViewById(R.id.imageViewArgentina);
        progressBarArgentina = view.findViewById(R.id.progressBarArgentina);

        Picasso.get().load("https://image.freepik.com/fotos-gratis/bandeira-da-argentina_1401-57.jpg")
                .into(imageViewArgentina, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarArgentina.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarArgentina.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}