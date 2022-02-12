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


public class FragmentNamibia extends Fragment {

    public static FragmentNamibia newInstance() {
        return new FragmentNamibia();
    }

    private ImageView imageViewNamibia;
    private ProgressBar progressBarNamibia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_namibia, container, false);

        imageViewNamibia = view.findViewById(R.id.imageViewNamibia);
        progressBarNamibia = view.findViewById(R.id.progressBarNamibia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-namibia_1401-180.jpg")
                .into(imageViewNamibia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarNamibia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarNamibia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}