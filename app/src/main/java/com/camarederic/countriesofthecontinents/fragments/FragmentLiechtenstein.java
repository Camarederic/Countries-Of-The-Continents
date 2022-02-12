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


public class FragmentLiechtenstein extends Fragment {

    public static FragmentLiechtenstein newInstance() {
        return new FragmentLiechtenstein();
    }

    private ImageView imageViewLiechtenstein;
    private ProgressBar progressBarLiechtenstein;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_liechtenstein, container, false);

        imageViewLiechtenstein = view.findViewById(R.id.imageViewLiechtenstein);
        progressBarLiechtenstein = view.findViewById(R.id.progressBarLiechtenstein);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-liechtenstein_1401-157.jpg")
                .into(imageViewLiechtenstein, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarLiechtenstein.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarLiechtenstein.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}