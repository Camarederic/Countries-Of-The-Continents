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


public class FragmentEswatini extends Fragment {

    public static FragmentEswatini newInstance(){
        return new FragmentEswatini();
    }

    private ImageView imageViewEswatini;
    private ProgressBar progressBarEswatini;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_eswatini, container, false);

        imageViewEswatini = view.findViewById(R.id.imageViewEswatini);
        progressBarEswatini = view.findViewById(R.id.progressBarEswatini);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-swaziland_1401-232.jpg")
                .into(imageViewEswatini, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarEswatini.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarEswatini.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}