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


public class FragmentNauru extends Fragment {

    public static FragmentNauru newInstance(){
        return new FragmentNauru();
    }

    private ImageView imageViewNauru;
    private ProgressBar progressBarNauru;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_nauru,container,false);

        imageViewNauru = view.findViewById(R.id.imageViewNauru);
        progressBarNauru = view.findViewById(R.id.progressBarNauru);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-nauru_1401-181.jpg")
                .into(imageViewNauru, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarNauru.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarNauru.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}