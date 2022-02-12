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


public class FragmentMartinique extends Fragment {

    public static FragmentMartinique newInstance() {
        return new FragmentMartinique();
    }

    private ImageView imageViewMartinique;
    private ProgressBar progressBarMartinique;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_martinique, container, false);

        imageViewMartinique = view.findViewById(R.id.imageViewMartinique);
        progressBarMartinique = view.findViewById(R.id.progressBarMartinique);

        Picasso.get().load("https://image.freepik.com/free-photo/waving-silk-flag-of-martinique_97886-4137.jpg")
                .into(imageViewMartinique, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarMartinique.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMartinique.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}