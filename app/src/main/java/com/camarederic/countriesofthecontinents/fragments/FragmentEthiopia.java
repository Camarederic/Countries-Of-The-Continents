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


public class FragmentEthiopia extends Fragment {

    public static FragmentEthiopia newInstance(){
        return new FragmentEthiopia();
    }

    private ImageView imageViewEthiopia;
    private ProgressBar progressBarEthiopia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ethiopia, container, false);

        imageViewEthiopia = view.findViewById(R.id.imageViewEthiopia);
        progressBarEthiopia = view.findViewById(R.id.progressBarEthiopia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-ethiopia_1401-111.jpg")
                .into(imageViewEthiopia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarEthiopia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarEthiopia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}