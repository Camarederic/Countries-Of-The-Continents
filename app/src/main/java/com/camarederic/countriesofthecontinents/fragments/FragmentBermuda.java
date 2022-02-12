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


public class FragmentBermuda extends Fragment {

    public static FragmentBermuda newInstance(){
        return new FragmentBermuda();
    }

    private ImageView imageViewBermuda;
    private ProgressBar progressBarBermuda;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bermuda, container, false);

        imageViewBermuda = view.findViewById(R.id.imageViewBermuda);
        progressBarBermuda = view.findViewById(R.id.progressBarBermuda);

        Picasso.get().load("https://image.freepik.com/free-photo/" +
                "bermuda-country-flag-on-wavy-silk-fabric-background-panorama-illustration_532963-1065.jpg")
                .into(imageViewBermuda, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarBermuda.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBermuda.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}