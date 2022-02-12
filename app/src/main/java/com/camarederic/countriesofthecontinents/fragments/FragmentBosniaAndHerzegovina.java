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


public class FragmentBosniaAndHerzegovina extends Fragment {


    public static FragmentBosniaAndHerzegovina newInstance(){
        return new FragmentBosniaAndHerzegovina();
    }

    private ImageView imageViewBosniaAndHerzegovina;
    private ProgressBar progressBarBosniaAndHerzegovina;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bosnia_and_herzegovina, container, false);

        imageViewBosniaAndHerzegovina = view.findViewById(R.id.imageViewBosniaAndHerzegovina);
        progressBarBosniaAndHerzegovina = view.findViewById(R.id.progressBarBosniaAndHerzegovina);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-bosnia-and-herzegovina_1401-74.jpg")
                .into(imageViewBosniaAndHerzegovina, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarBosniaAndHerzegovina.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBosniaAndHerzegovina.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}