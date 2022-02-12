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


public class FragmentRussia extends Fragment {

    public static FragmentRussia newInstance() {
        return new FragmentRussia();
    }

    private ImageView imageViewRussia;
    private ProgressBar progressBarRussia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_russia, container, false);

        imageViewRussia = view.findViewById(R.id.imageViewRussia);
        progressBarRussia = view.findViewById(R.id.progressBarRussia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-russia_1401-206.jpg")
                .into(imageViewRussia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarRussia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarRussia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}