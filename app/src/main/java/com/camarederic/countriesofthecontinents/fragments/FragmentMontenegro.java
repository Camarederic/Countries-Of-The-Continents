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


public class FragmentMontenegro extends Fragment {

    public static FragmentMontenegro newInstance() {
        return new FragmentMontenegro();
    }

    private ImageView imageViewMontenegro;
    private ProgressBar progressBarMontenegro;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_montenegro, container, false);

        imageViewMontenegro = view.findViewById(R.id.imageViewMontenegro);
        progressBarMontenegro = view.findViewById(R.id.progressBarMontenegro);

        Picasso.get().load("https://militaryarms.ru/wp-content/uploads/2021/08/f2023da96e334c098f4520643356daba.jpg")
                .into(imageViewMontenegro, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarMontenegro.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMontenegro.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}