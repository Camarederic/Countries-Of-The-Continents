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

public class FragmentUganda extends Fragment {

    public static FragmentUganda newInstance() {
        return new FragmentUganda();
    }

    private ImageView imageViewUganda;
    private ProgressBar progressBarUganda;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_uganda, container, false);

        imageViewUganda = view.findViewById(R.id.imageViewUganda);
        progressBarUganda = view.findViewById(R.id.progressBarUganda);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-uganda_1401-248.jpg")
                .into(imageViewUganda, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarUganda.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarUganda.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}