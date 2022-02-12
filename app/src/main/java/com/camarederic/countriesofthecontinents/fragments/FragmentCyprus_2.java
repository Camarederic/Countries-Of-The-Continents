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


public class FragmentCyprus_2 extends Fragment {

    public static FragmentCyprus_2 newInstance(){
        return new FragmentCyprus_2();
    }

    private ImageView imageViewCyprus_2;
    private ProgressBar progressBarCyprus_2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cyprus_2, container, false);

        imageViewCyprus_2 = view.findViewById(R.id.imageViewCyprus_2);
        progressBarCyprus_2 = view.findViewById(R.id.progressBarCyprus_2);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-cyprus_1401-97.jpg")
                .into(imageViewCyprus_2, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarCyprus_2.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarCyprus_2.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}