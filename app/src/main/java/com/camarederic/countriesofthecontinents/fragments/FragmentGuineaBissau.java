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


public class FragmentGuineaBissau extends Fragment {

    public static FragmentGuineaBissau newInstance() {
        return new FragmentGuineaBissau();
    }

    private ImageView imageViewGuineaBissau;
    private ProgressBar progressBarGuineaBissau;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_guinea_bissau, container, false);

        imageViewGuineaBissau = view.findViewById(R.id.imageViewGuineaBissau);
        progressBarGuineaBissau = view.findViewById(R.id.progressBarGuineaBissau);

        Picasso.get().load("https://cs11.pikabu.ru/post_img/big/2019/03/04/5/1551684984114963309.jpg")
                .into(imageViewGuineaBissau, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarGuineaBissau.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarGuineaBissau.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}