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


public class FragmentBahrain extends Fragment {

    public static FragmentBahrain newInstance(){
        return new FragmentBahrain();
    }


    private ImageView imageViewBahrain;
    private ProgressBar progressBarBahrain;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bahrain, container, false);

        imageViewBahrain = view.findViewById(R.id.imageViewBahrain);
        progressBarBahrain = view.findViewById(R.id.progressBarBahrain);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-bahrain_1401-64.jpg")
                .into(imageViewBahrain, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarBahrain.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBahrain.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}