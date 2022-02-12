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


public class FragmentBrunei extends Fragment {

    public static FragmentBrunei newInstance(){
        return new FragmentBrunei();
    }


    private ImageView imageViewBrunei;
    private ProgressBar progressBarBrunei;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_brunei, container, false);

        imageViewBrunei = view.findViewById(R.id.imageViewBrunei);
        progressBarBrunei = view.findViewById(R.id.progressBarBrunei);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-brunei_1401-77.jpg")
                .into(imageViewBrunei, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarBrunei.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBrunei.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}