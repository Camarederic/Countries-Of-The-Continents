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


public class FragmentHungary extends Fragment {

    public static FragmentHungary newInstance() {
        return new FragmentHungary();
    }

    private ImageView imageViewHungary;
    private ProgressBar progressBarHungary;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_hungary, container, false);

        imageViewHungary = view.findViewById(R.id.imageViewHungary);
        progressBarHungary = view.findViewById(R.id.progressBarIceland);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-hungary_1401-129.jpg")
                .into(imageViewHungary, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarHungary.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarHungary.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}