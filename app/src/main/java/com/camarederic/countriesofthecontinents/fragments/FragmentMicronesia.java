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


public class FragmentMicronesia extends Fragment {


    public static FragmentMicronesia newInstance() {
        return new FragmentMicronesia();
    }

    private ImageView imageViewMicronesia;
    private ProgressBar progressBarMicronesia;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_micronesia, container, false);

        imageViewMicronesia = view.findViewById(R.id.imageViewMicronesia);
        progressBarMicronesia = view.findViewById(R.id.progressBarMicronesia);

        Picasso.get().load("https://ak.picdn.net/shutterstock/videos/2479385/thumb/1.jpg")
                .into(imageViewMicronesia, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarMicronesia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMicronesia.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}