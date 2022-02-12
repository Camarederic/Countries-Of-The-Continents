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


public class FragmentBarbados extends Fragment {

    public static FragmentBarbados newInstance(){
        return new FragmentBarbados();
    }

    private ImageView imageViewBarbados;
    private ProgressBar progressBarBarbados;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_barbados, container, false);

        imageViewBarbados = view.findViewById(R.id.imageViewBarbados);
        progressBarBarbados = view.findViewById(R.id.progressBarBarbados);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-barbados_1401-66.jpg")
                .into(imageViewBarbados, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarBarbados.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBarbados.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}