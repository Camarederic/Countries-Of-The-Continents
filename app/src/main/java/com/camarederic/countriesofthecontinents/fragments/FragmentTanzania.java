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


public class FragmentTanzania extends Fragment {

    public static FragmentTanzania newInstance() {
        return new FragmentTanzania();
    }

    private ImageView imageViewTanzania;
    private ProgressBar progressBarTanzania;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tanzania, container, false);

        imageViewTanzania = view.findViewById(R.id.imageViewTanzania);
        progressBarTanzania = view.findViewById(R.id.progressBarTanzania);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-tanzania_1401-238.jpg")
                .into(imageViewTanzania, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarTanzania.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarTanzania.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}