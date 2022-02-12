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


public class FragmentBenin extends Fragment {

    public static FragmentBenin newInstance(){
        return new FragmentBenin();
    }

    private ImageView imageViewBenin;
    private ProgressBar progressBarBenin;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_benin, container, false);

        imageViewBenin = view.findViewById(R.id.imageViewBenin);
        progressBarBenin = view.findViewById(R.id.progressBarBenin);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-benin_1401-71.jpg")
                .into(imageViewBenin, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarBenin.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBenin.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}