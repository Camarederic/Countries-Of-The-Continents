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


public class FragmentCapeVerde extends Fragment {

    public static FragmentCapeVerde newInstance(){
        return new FragmentCapeVerde();
    }

    private ImageView imageViewCapeVerde;
    private ProgressBar progressBarCapeVerde;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cape_verde, container, false);

        imageViewCapeVerde = view.findViewById(R.id.imageViewCapeVerde);
        progressBarCapeVerde = view.findViewById(R.id.progressBarCapeVerde);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-cape-verde_1401-85.jpg")
                .into(imageViewCapeVerde, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarCapeVerde.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarCapeVerde.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}