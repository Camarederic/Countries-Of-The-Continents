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


public class FragmentTonga extends Fragment {

    public static FragmentTonga newInstance(){
        return new FragmentTonga();
    }

    private ImageView imageViewTonga;
    private ProgressBar progressBarTonga;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tonga,container,false);

        imageViewTonga = view.findViewById(R.id.imageViewTonga);
        progressBarTonga = view.findViewById(R.id.progressBarTonga);

        Picasso.get().load("https://image.freepik.com/darmowe-zdjecie/flaga-tonga_1401-241.jpg")
                .into(imageViewTonga, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarTonga.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarTonga.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}