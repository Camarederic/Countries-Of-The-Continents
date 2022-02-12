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


public class FragmentBahamas extends Fragment {

    public static FragmentBahamas newInstance(){
        return new FragmentBahamas();
    }

    private ImageView imageViewBahamas;
    private ProgressBar progressBarBahamas;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bahamas, container, false);

        imageViewBahamas = view.findViewById(R.id.imageViewBahamas);
        progressBarBahamas = view.findViewById(R.id.progressBarBahamas);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-bahamas_1401-63.jpg")
                .into(imageViewBahamas, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarBahamas.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBahamas.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}