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


public class FragmentBelarus extends Fragment {

    public static FragmentBelarus newInstance(){
        return new FragmentBelarus();
    }

    private ImageView imageViewBelarus;
    private ProgressBar progressBarBelarus;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_belarus, container, false);

        imageViewBelarus = view.findViewById(R.id.imageViewBelarus);
        progressBarBelarus = view.findViewById(R.id.progressBarBelarus);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-belarus_1401-67.jpg")
                .into(imageViewBelarus, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarBelarus.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBelarus.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}