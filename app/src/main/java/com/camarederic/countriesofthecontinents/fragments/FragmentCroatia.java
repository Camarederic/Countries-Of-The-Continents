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


public class FragmentCroatia extends Fragment {

    public static FragmentCroatia newInstance(){
        return new FragmentCroatia();
    }

    private ImageView imageViewCroatia;
    private ProgressBar progressBarCroatia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_croatia, container, false);

        imageViewCroatia = view.findViewById(R.id.imageViewCroatia);
        progressBarCroatia = view.findViewById(R.id.progressBarCroatia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-croatia_1401-95.jpg")
                .into(imageViewCroatia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarCroatia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarCroatia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}