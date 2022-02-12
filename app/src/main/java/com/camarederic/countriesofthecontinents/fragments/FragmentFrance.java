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


public class FragmentFrance extends Fragment {

    public static FragmentFrance newInstance(){
        return new FragmentFrance();
    }

    private ImageView imageViewFrance;
    private ProgressBar progressBarFrance;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_france, container, false);

        imageViewFrance = view.findViewById(R.id.imageViewFrance);
        progressBarFrance = view.findViewById(R.id.progressBarFrance);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-france_1401-114.jpg")
                .into(imageViewFrance, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarFrance.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarFrance.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}