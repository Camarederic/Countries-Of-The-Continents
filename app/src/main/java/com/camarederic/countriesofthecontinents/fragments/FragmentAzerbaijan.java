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


public class FragmentAzerbaijan extends Fragment {

    public static FragmentAzerbaijan newInstance(){
        return new FragmentAzerbaijan();
    }

    private ImageView imageViewAzerbaijan;
    private ProgressBar progressBarAzerbaijan;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_azerbaijan, container, false);

        imageViewAzerbaijan = view.findViewById(R.id.imageViewAzerbaijan);
        progressBarAzerbaijan = view.findViewById(R.id.progressBarAzerbaijan);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-azerbaijan_1401-62.jpg")
                .into(imageViewAzerbaijan, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarAzerbaijan.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarAzerbaijan.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}