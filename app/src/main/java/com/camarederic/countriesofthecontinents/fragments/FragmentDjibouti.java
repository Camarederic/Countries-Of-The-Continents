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


public class FragmentDjibouti extends Fragment {

    public static FragmentDjibouti newInstance(){
        return new FragmentDjibouti();
    }

    private ImageView imageViewDjibouti;
    private ProgressBar progressBarDjibouti;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_djibouti, container, false);

        imageViewDjibouti = view.findViewById(R.id.imageViewDjibouti);
        progressBarDjibouti = view.findViewById(R.id.progressBarDjibouti);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-djibouti_1401-100.jpg")
                .into(imageViewDjibouti, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarDjibouti.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarDjibouti.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}