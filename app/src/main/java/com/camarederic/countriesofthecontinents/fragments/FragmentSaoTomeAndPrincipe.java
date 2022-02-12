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


public class FragmentSaoTomeAndPrincipe extends Fragment {

    public static FragmentSaoTomeAndPrincipe newInstance() {
        return new FragmentSaoTomeAndPrincipe();
    }

    private ImageView imageViewSaoTomeAndPrincipe;
    private ProgressBar progressBarSaoTomeAndPrincipe;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sao_tome_and_principe, container, false);

        imageViewSaoTomeAndPrincipe = view.findViewById(R.id.imageViewSaoTomeAndPrincipe);
        progressBarSaoTomeAndPrincipe = view.findViewById(R.id.progressBarSaoTomeAndPrincipe);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-sao-tome-and-principe_1401-214.jpg")
                .into(imageViewSaoTomeAndPrincipe, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSaoTomeAndPrincipe.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSaoTomeAndPrincipe.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}