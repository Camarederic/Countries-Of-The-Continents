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


public class FragmentGeorgia_2 extends Fragment {

    public static FragmentGeorgia_2 newInstance(){
        return new FragmentGeorgia_2();
    }

    private ImageView imageViewGeorgia_2;
    private ProgressBar progressBarGeorgia_2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_georgia_2, container, false);

        imageViewGeorgia_2 = view.findViewById(R.id.imageViewGeorgia_2);
        progressBarGeorgia_2 = view.findViewById(R.id.progressBarGeorgia_2);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-georgia_1401-117.jpg")
                .into(imageViewGeorgia_2, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarGeorgia_2.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarGeorgia_2.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}