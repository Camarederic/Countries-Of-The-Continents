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


public class FragmentPanama extends Fragment {

    public static FragmentPanama newInstance() {
        return new FragmentPanama();
    }

    private ImageView imageViewPanama;
    private ProgressBar progressBarPanama;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_panama, container, false);

        imageViewPanama = view.findViewById(R.id.imageViewPanama);
        progressBarPanama = view.findViewById(R.id.progressBarPanama);

        Picasso.get().load("https://besthqwallpapers.com/Uploads/7-9-2017/20020/" +
                "thumb2-panama-flag-panama-silk-flag-national-symbols-central-america.jpg")
                .into(imageViewPanama, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarPanama.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarPanama.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}