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


public class FragmentGuadeloupe extends Fragment {

    public static FragmentGuadeloupe newInstance() {
        return new FragmentGuadeloupe();
    }

    private ImageView imageViewGuadeloupe;
    private ProgressBar progressBarGuadeloupe;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_guadeloupe, container, false);

        imageViewGuadeloupe = view.findViewById(R.id.imageViewGuadeloupe);
        progressBarGuadeloupe = view.findViewById(R.id.progressBarGuadeloupe);

        Picasso.get().load("https://media.istockphoto.com/photos/guadeloupe-picture-" +
                "id506005998?k=20&m=506005998&s=612x612&w=0&h=3oo4LAy4QH409C2iDir_zgU1ioaNgAdYITwRuXByMMM=")
                .into(imageViewGuadeloupe, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarGuadeloupe.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarGuadeloupe.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}