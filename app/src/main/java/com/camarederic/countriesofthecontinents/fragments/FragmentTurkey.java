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


public class FragmentTurkey extends Fragment {

    public static FragmentTurkey newInstance() {
        return new FragmentTurkey();
    }

    private ImageView imageViewTurkey;
    private ProgressBar progressBarTurkey;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_turkey, container, false);

        imageViewTurkey = view.findViewById(R.id.imageViewTurkey);
        progressBarTurkey = view.findViewById(R.id.progressBarTurkey);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-turkey_1401-245.jpg")
                .into(imageViewTurkey, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarTurkey.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarTurkey.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}