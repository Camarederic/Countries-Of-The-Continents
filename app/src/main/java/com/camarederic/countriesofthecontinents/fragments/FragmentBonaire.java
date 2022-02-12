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


public class FragmentBonaire extends Fragment {

    public static FragmentBonaire newInstance(){
        return new FragmentBonaire();
    }

    private ImageView imageViewBonaire;
    private ProgressBar progressBarBonaire;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bonaire, container, false);

        imageViewBonaire = view.findViewById(R.id.imageViewBonaire);
        progressBarBonaire = view.findViewById(R.id.progressBarBonaire);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-bonaire-as-the-background_454892-1196.jpg")
                .into(imageViewBonaire, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarBonaire.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBonaire.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}