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


public class FragmentCanaryIslands extends Fragment {


    public static FragmentCanaryIslands newInstance(){
        return new FragmentCanaryIslands();
    }

    private ImageView imageViewCanaryIslands;
    private ProgressBar progressBarCanaryIslands;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_canary_islands, container, false);

        imageViewCanaryIslands = view.findViewById(R.id.imageViewCanaryIslands);
        progressBarCanaryIslands = view.findViewById(R.id.progressBarCanaryIslands);

        Picasso.get().load("https://besthqwallpapers.com/Uploads/10-10-2017/23441/" +
                "thumb2-flag-of-the-canary-islands-spain-national-flag-autonomous-community-canary-islands.jpg")
                .into(imageViewCanaryIslands, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarCanaryIslands.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarCanaryIslands.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}