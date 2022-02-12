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


public class FragmentArgentineAntarctica extends Fragment {


    public static FragmentArgentineAntarctica newInstance(){
        return new FragmentArgentineAntarctica();
    }

    private ImageView imageViewArgentineAntarctica;
    private ProgressBar progressBarArgentineAntarctica;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_argentine_antarctica,container,false);

        imageViewArgentineAntarctica = view.findViewById(R.id.imageViewArgentineAntarctica);
        progressBarArgentineAntarctica = view.findViewById(R.id.progressBarArgentineAntarctica);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/" +
                "Bandera_de_la_Provincia_de_Tierra_del_Fuego.svg/500px-Bandera_de_la_Provincia_de_Tierra_del_Fuego.svg.png")
                .into(imageViewArgentineAntarctica, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarArgentineAntarctica.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarArgentineAntarctica.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}