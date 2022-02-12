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


public class FragmentWesternSahara extends Fragment {


    public static FragmentWesternSahara newInstance() {
        return new FragmentWesternSahara();
    }

    private ImageView imageViewWesternSahara;
    private ProgressBar progressBarWesternSahara;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_western_sahara, container, false);

        imageViewWesternSahara = view.findViewById(R.id.imageViewWesternSahara);
        progressBarWesternSahara = view.findViewById(R.id.progressBarWesternSahara);

        Picasso.get().load("https://st4.depositphotos.com/19462672/24374/i/600/" +
                "depositphotos_243749902-stock-photo-western-sahara-flag-background-with.jpg")
                .into(imageViewWesternSahara, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarWesternSahara.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarWesternSahara.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}