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


public class FragmentMalta extends Fragment {

    public static FragmentMalta newInstance() {
        return new FragmentMalta();
    }

    private ImageView imageViewMalta;
    private ProgressBar progressBarMalta;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_malta, container, false);

        imageViewMalta = view.findViewById(R.id.imageViewMalta);
        progressBarMalta = view.findViewById(R.id.progressBarMalta);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-malta_1401-167.jpg")
                .into(imageViewMalta, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarMalta.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMalta.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}