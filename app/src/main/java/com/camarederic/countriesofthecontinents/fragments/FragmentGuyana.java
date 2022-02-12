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


public class FragmentGuyana extends Fragment {

    public static FragmentGuyana newInstance() {
        return new FragmentGuyana();
    }

    private ImageView imageViewGuyana;
    private ProgressBar progressBarGuyana;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_guyana, container, false);

        imageViewGuyana = view.findViewById(R.id.imageViewGuyana);
        progressBarGuyana = view.findViewById(R.id.progressBarGuyana);

        Picasso.get().load("https://ak.picdn.net/shutterstock/videos/1063066135/thumb/1.jpg?ip=x480")
                .into(imageViewGuyana, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarGuyana.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarGuyana.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}