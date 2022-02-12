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


public class FragmentCambodia extends Fragment {

    public static FragmentCambodia newInstance(){
        return new FragmentCambodia();
    }


    private ImageView imageViewCambodia;
    private ProgressBar progressBarCambodia;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cambodia, container, false);

        imageViewCambodia = view.findViewById(R.id.imageViewCambodia);
        progressBarCambodia = view.findViewById(R.id.progressBarCambodia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-cambodia_1401-82.jpg")
                .into(imageViewCambodia, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarCambodia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarCambodia.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}