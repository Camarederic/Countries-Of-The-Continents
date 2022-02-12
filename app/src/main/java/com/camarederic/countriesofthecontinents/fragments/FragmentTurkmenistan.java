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


public class FragmentTurkmenistan extends Fragment {


    public static FragmentTurkmenistan newInstance() {
        return new FragmentTurkmenistan();
    }

    private ImageView imageViewTurkmenistan;
    private ProgressBar progressBarTurkmenistan;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_turkmenistan, container, false);

        imageViewTurkmenistan = view.findViewById(R.id.imageViewTurkmenistan);
        progressBarTurkmenistan = view.findViewById(R.id.progressBarTurkmenistan);

        Picasso.get().load("https://astromagicmoon.ru/wp-content/uploads/2019/11/turkmenistan.jpg")
                .into(imageViewTurkmenistan, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarTurkmenistan.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarTurkmenistan.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}