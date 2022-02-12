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


public class FragmentMexico extends Fragment {

    public static FragmentMexico newInstance() {
        return new FragmentMexico();
    }

    private ImageView imageViewMexico;
    private ProgressBar progressBarMexico;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mexico, container, false);

        imageViewMexico = view.findViewById(R.id.imageViewMexico);
        progressBarMexico = view.findViewById(R.id.progressBarMexico);

        Picasso.get().load("https://img.freepik.com/free-photo/flag-of-mexico_1401-171.jpg?size=626&ext=jpg")
                .into(imageViewMexico, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarMexico.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMexico.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}