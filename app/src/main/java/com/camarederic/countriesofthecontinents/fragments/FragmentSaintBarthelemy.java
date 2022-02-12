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


public class FragmentSaintBarthelemy extends Fragment {

    public static FragmentSaintBarthelemy newInstance() {
        return new FragmentSaintBarthelemy();
    }

    private ImageView imageViewSaintBarthelemy;
    private ProgressBar progressBarSaintBarthelemy;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_saint_barthelemy, container, false);

        imageViewSaintBarthelemy = view.findViewById(R.id.imageViewSaintBarthelemy);
        progressBarSaintBarthelemy = view.findViewById(R.id.progressBarSaintBarthelemy);

        Picasso.get().load("https://images.fineartamerica.com/images/artworkimages/" +
                "mediumlarge/2/saint-barthelemy-flag-hasan-ahmed.jpg")
                .into(imageViewSaintBarthelemy, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSaintBarthelemy.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSaintBarthelemy.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}