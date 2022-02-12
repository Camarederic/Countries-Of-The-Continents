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


public class FragmentSanAndresAndProvidencia extends Fragment {

    public static FragmentSanAndresAndProvidencia newInstance() {
        return new FragmentSanAndresAndProvidencia();
    }

    private ImageView imageViewSanAndresAndProvidencia;
    private ProgressBar progressBarSanAndresAndProvidencia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_san_andres_ans_providencia, container, false);

        imageViewSanAndresAndProvidencia = view.findViewById(R.id.imageViewSanAndresAndProvidencia);
        progressBarSanAndresAndProvidencia = view.findViewById(R.id.progressBarSanAndresAndProvidencia);

        Picasso.get().load("https://st3.depositphotos.com/9365028/31925/i/600/" +
                "depositphotos_319256952-stock-photo-flag-of-archipelago-of-san.jpg")
                .into(imageViewSanAndresAndProvidencia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSanAndresAndProvidencia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSanAndresAndProvidencia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}