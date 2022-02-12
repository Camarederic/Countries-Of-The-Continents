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


public class FragmentIraq extends Fragment {


    public static FragmentIraq newIbstance() {
        return new FragmentIraq();
    }

    private ImageView imageViewIraq;
    private ProgressBar progressBarIraq;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_iraq, container, false);

        imageViewIraq = view.findViewById(R.id.imageViewIraq);
        progressBarIraq = view.findViewById(R.id.progressBarIraq);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-iraq_1401-135.jpg")
                .into(imageViewIraq, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarIraq.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarIraq.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}