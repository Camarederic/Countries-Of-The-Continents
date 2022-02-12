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


public class FragmentCzechia extends Fragment {


    public static FragmentCzechia newInstance(){
        return new FragmentCzechia();
    }

    private ImageView imageViewCzechia;
    private ProgressBar progressBarCzechia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_czechia, container, false);

        imageViewCzechia = view.findViewById(R.id.imageViewCzechia);
        progressBarCzechia = view.findViewById(R.id.progressBarCzechia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-czech-republic_1401-98.jpg")
                .into(imageViewCzechia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarCzechia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarCzechia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}