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


public class FragmentEstonia extends Fragment {

    public static FragmentEstonia newInstance(){
        return new FragmentEstonia();
    }

    private ImageView imageViewEstonia;
    private ProgressBar progressBarEstonia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_estonia, container, false);

        imageViewEstonia = view.findViewById(R.id.imageViewEstonia);
        progressBarEstonia = view.findViewById(R.id.progressBarEstonia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-estonia_1401-108.jpg")
                .into(imageViewEstonia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarEstonia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarEstonia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}