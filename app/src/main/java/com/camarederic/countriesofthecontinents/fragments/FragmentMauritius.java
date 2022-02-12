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


public class FragmentMauritius extends Fragment {

    public static FragmentMauritius newInstance() {
        return new FragmentMauritius();
    }

    private ImageView imageViewMauritius;
    private ProgressBar progressBarMauritius;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mauritius, container, false);

        imageViewMauritius = view.findViewById(R.id.imageViewMauritius);
        progressBarMauritius = view.findViewById(R.id.progressBarMauritius);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-mauritius_1401-170.jpg")
                .into(imageViewMauritius, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarMauritius.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMauritius.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}