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


public class FragmentUkraine extends Fragment {

    public static FragmentUkraine newInstance() {
        return new FragmentUkraine();
    }

    private ImageView imageViewUkraine;
    private ProgressBar progressBarUkraine;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ukraine, container, false);

        imageViewUkraine = view.findViewById(R.id.imageViewUkraine);
        progressBarUkraine = view.findViewById(R.id.progressBarUkraine);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-ukraine_1401-249.jpg")
                .into(imageViewUkraine, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarUkraine.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarUkraine.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}