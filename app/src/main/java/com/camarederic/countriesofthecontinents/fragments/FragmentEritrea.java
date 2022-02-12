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


public class FragmentEritrea extends Fragment {

    public static FragmentEritrea newInstance(){
        return new FragmentEritrea();
    }

    private ImageView imageViewEritrea;
    private ProgressBar progressBarEritrea;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_eritrea, container, false);

        imageViewEritrea = view.findViewById(R.id.imageViewEritrea);
        progressBarEritrea = view.findViewById(R.id.progressBarEritrea);

        Picasso.get().load("https://media.gettyimages.com/videos/eritrea-flag-video-id1139255412?s=640x640")
                .into(imageViewEritrea, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarEritrea.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarEritrea.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}