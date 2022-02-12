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


public class FragmentIndia extends Fragment {

    public static FragmentIndia newInstance(){
        return new FragmentIndia();
    }

    private ImageView imageViewIndia;
    private ProgressBar progressBarIndia;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_india, container, false);

        imageViewIndia = view.findViewById(R.id.imageViewIndia);
        progressBarIndia = view.findViewById(R.id.progressBarIndia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-india_1401-132.jpg")
                .into(imageViewIndia, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarIndia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarIndia.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}