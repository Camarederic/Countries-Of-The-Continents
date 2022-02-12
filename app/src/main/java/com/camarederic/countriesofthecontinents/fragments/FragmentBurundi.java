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


public class FragmentBurundi extends Fragment {

    public static FragmentBurundi newInstance(){
        return new FragmentBurundi();
    }

    private ImageView imageViewBurundi;
    private ProgressBar progressBarBurundi;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_burundi, container, false);

        imageViewBurundi = view.findViewById(R.id.imageViewBurundi);
        progressBarBurundi = view.findViewById(R.id.progressBarBurundi);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-burundi_1401-81.jpg")
                .into(imageViewBurundi, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarBurundi.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBurundi.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}