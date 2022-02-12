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


public class FragmentSlovakia extends Fragment {

    public static FragmentSlovakia newInstance() {
        return new FragmentSlovakia();
    }

    private ImageView imageViewSlovakia;
    private ProgressBar progressBarSlovakia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_slovakia, container, false);

        imageViewSlovakia = view.findViewById(R.id.imageViewSlovakia);
        progressBarSlovakia = view.findViewById(R.id.progressBarSlovakia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-slovakia_1401-221.jpg")
                .into(imageViewSlovakia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSlovakia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSlovakia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }

}