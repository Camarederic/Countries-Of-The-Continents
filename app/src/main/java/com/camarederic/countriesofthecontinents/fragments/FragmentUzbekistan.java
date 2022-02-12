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


public class FragmentUzbekistan extends Fragment {


    public static FragmentUzbekistan newInstance() {
        return new FragmentUzbekistan();
    }

    private ImageView imageViewUzbekistan;
    private ProgressBar progressBarUzbekistan;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_uzbekistan, container, false);

        imageViewUzbekistan = view.findViewById(R.id.imageViewUzbekistan);
        progressBarUzbekistan = view.findViewById(R.id.progressBarUzbekistan);

        Picasso.get().load("https://img.freepik.com/free-photo/flag-of-uzbekistan_1401-255.jpg?size=626&ext=jpg")
                .into(imageViewUzbekistan, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarUzbekistan.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarUzbekistan.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}