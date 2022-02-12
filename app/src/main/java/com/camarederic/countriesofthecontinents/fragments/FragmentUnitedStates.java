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


public class FragmentUnitedStates extends Fragment {

    public static FragmentUnitedStates newInstance() {
        return new FragmentUnitedStates();
    }

    private ImageView imageViewUnitedStates;
    private ProgressBar progressBarUnitedStates;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_united_states, container, false);

        imageViewUnitedStates = view.findViewById(R.id.imageViewUnitedStates);
        progressBarUnitedStates = view.findViewById(R.id.progressBarUnitedStates);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-united-states-of-america_1401-253.jpg")
                .into(imageViewUnitedStates, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarUnitedStates.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarUnitedStates.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}