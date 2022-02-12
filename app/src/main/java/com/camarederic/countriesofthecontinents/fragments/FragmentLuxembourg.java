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


public class FragmentLuxembourg extends Fragment {

    public static FragmentLuxembourg newInstance() {
        return new FragmentLuxembourg();
    }

    private ImageView imageViewLuxembourg;
    private ProgressBar progressBarLuxembourg;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_luxembourg, container, false);

        imageViewLuxembourg = view.findViewById(R.id.imageViewLuxembourg);
        progressBarLuxembourg = view.findViewById(R.id.progressBarLuxembourg);

        Picasso.get().load("https://vsenovostint.ru/wp-content/uploads/2019/08/2-1.jpg")
                .into(imageViewLuxembourg, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarLuxembourg.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarLuxembourg.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}