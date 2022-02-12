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


public class FragmentFalklandIslands extends Fragment {

    public static FragmentFalklandIslands newInstance(){
        return new FragmentFalklandIslands();
    }

    private ImageView imageViewFalklandIslands;
    private ProgressBar progressBarFalklandIslands;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_falkland_islands, container, false);

        imageViewFalklandIslands = view.findViewById(R.id.imageViewFalklandIslands);
        progressBarFalklandIslands = view.findViewById(R.id.progressBarFalklandIslands);

        Picasso.get().load("https://ak.picdn.net/shutterstock/videos/22329130/thumb/1.jpg")
                .into(imageViewFalklandIslands, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarFalklandIslands.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarFalklandIslands.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}