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


public class FragmentLaos extends Fragment {

    public static FragmentLaos newInstance() {
        return new FragmentLaos();
    }

    private ImageView imageViewLaos;
    private ProgressBar progressBarLaos;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_laos, container, false);

        imageViewLaos = view.findViewById(R.id.imageViewLaos);
        progressBarLaos = view.findViewById(R.id.progressBarLaos);

        Picasso.get().load("https://astromagicmoon.ru/wp-content/uploads/2019/11/laos.jpg")
                .into(imageViewLaos, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarLaos.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarLaos.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}