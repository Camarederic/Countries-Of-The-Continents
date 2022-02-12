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


public class FragmentFinland extends Fragment {

    public static FragmentFinland newInstance(){
        return new FragmentFinland();
    }

    private ImageView imageViewFinland;
    private ProgressBar progressBarFinland;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_finland, container, false);

        imageViewFinland = view.findViewById(R.id.imageViewFinland);
        progressBarFinland = view.findViewById(R.id.progressBarFinland);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-finland_1401-113.jpg")
                .into(imageViewFinland, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarFinland.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarFinland.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}