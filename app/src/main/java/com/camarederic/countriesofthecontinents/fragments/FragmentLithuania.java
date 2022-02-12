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


public class FragmentLithuania extends Fragment {

    public static FragmentLithuania newInstance() {
        return new FragmentLithuania();
    }

    private ImageView imageViewLithuania;
    private ProgressBar progressBarLithuania;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lithuania, container, false);

        imageViewLithuania = view.findViewById(R.id.imageViewLithuania);
        progressBarLithuania = view.findViewById(R.id.progressBarLithuania);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-lithuania_1401-158.jpg")
                .into(imageViewLithuania, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarLithuania.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarLithuania.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}