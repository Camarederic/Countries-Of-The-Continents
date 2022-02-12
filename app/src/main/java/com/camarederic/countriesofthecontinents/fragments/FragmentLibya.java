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


public class FragmentLibya extends Fragment {


    public static FragmentLibya newInstance() {
        return new FragmentLibya();
    }

    private ImageView imageViewLibya;
    private ProgressBar progressBarLibya;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_libya, container, false);

        imageViewLibya = view.findViewById(R.id.imageViewLibya);
        progressBarLibya = view.findViewById(R.id.progressBarLibya);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-lybia_1401-156.jpg")
                .into(imageViewLibya, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarLibya.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarLibya.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}