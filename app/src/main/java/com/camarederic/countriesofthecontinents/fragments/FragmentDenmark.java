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


public class FragmentDenmark extends Fragment {

    public static FragmentDenmark newInstance(){
        return new FragmentDenmark();
    }

    private ImageView imageViewDenmark;
    private ProgressBar progressBarDenmark;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_denmark, container, false);

        imageViewDenmark = view.findViewById(R.id.imageViewDenmark);
        progressBarDenmark = view.findViewById(R.id.progressBarDenmark);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-denmark_1401-99.jpg")
                .into(imageViewDenmark, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarDenmark.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarDenmark.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}