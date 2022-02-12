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


public class FragmentBulgaria extends Fragment {

    public static FragmentBulgaria newInstance(){
        return new FragmentBulgaria();
    }

    private ImageView imageViewBulgaria;
    private ProgressBar progressBarBulgaria;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bulgaria, container, false);

        imageViewBulgaria = view.findViewById(R.id.imageViewBulgaria);
        progressBarBulgaria = view.findViewById(R.id.progressBarBulgaria);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-bulgaria_1401-78.jpg")
                .into(imageViewBulgaria, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarBulgaria.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBulgaria.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}