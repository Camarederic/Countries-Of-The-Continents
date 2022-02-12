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


public class FragmentEcuador extends Fragment {

    public static FragmentEcuador newInstance(){
        return new FragmentEcuador();
    }

    private ImageView imageViewEcuador;
    private ProgressBar progressBarEcuador;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ecuador, container, false);

        imageViewEcuador = view.findViewById(R.id.imageViewEcuador);
        progressBarEcuador = view.findViewById(R.id.progressBarEcuador);

        Picasso.get().load("https://astromagicmoon.ru/wp-content/uploads/2020/02/ekvador.jpg")
                .into(imageViewEcuador, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarEcuador.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarEcuador.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}