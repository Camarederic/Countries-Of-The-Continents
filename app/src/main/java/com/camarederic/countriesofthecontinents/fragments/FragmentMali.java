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


public class FragmentMali extends Fragment {

    public static FragmentMali newInstance() {
        return new FragmentMali();
    }

    private ImageView imageViewMali;
    private ProgressBar progressBarMali;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mali, container, false);

        imageViewMali = view.findViewById(R.id.imageViewMali);
        progressBarMali = view.findViewById(R.id.progressBarMali);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-mali_1401-166.jpg")
                .into(imageViewMali, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarMali.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMali.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}