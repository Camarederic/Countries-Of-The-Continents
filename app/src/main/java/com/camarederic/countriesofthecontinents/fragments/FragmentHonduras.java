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


public class FragmentHonduras extends Fragment {

    public static FragmentHonduras newInstance() {
        return new FragmentHonduras();
    }

    private ImageView imageViewHonduras;
    private ProgressBar progressBarHonduras;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_honduras, container, false);

        imageViewHonduras = view.findViewById(R.id.imageViewHonduras);
        progressBarHonduras = view.findViewById(R.id.progressBarHonduras);

        Picasso.get().load("https://i.pinimg.com/originals/2a/51/af/2a51af5be87caea365f41fd3c76505e5.png")
                .into(imageViewHonduras, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarHonduras.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarHonduras.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}