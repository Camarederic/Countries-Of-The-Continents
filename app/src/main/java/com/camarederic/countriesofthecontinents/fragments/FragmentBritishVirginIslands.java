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


public class FragmentBritishVirginIslands extends Fragment {

    public static FragmentBritishVirginIslands newInstance(){
        return new FragmentBritishVirginIslands();
    }

    private ImageView imageViewBritishVirginIslands;
    private ProgressBar progressBarBritishVirginIslands;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_british_virgin_islands, container, false);

        imageViewBritishVirginIslands = view.findViewById(R.id.imageViewBritishVirginIslands);
        progressBarBritishVirginIslands = view.findViewById(R.id.progressBarBritishVirginIslands);

        Picasso.get().load("https://i.ytimg.com/vi/Kd2jdyq3l2M/maxresdefault.jpg")
                .into(imageViewBritishVirginIslands, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarBritishVirginIslands.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBritishVirginIslands.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}