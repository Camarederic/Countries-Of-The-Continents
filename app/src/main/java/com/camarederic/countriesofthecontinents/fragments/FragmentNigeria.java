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


public class FragmentNigeria extends Fragment {

    public static FragmentNigeria newInstance() {
        return new FragmentNigeria();
    }

    private ImageView imageViewNigeria;
    private ProgressBar progressBarNigeria;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_nigeria, container, false);

        imageViewNigeria = view.findViewById(R.id.imageViewNigeria);
        progressBarNigeria = view.findViewById(R.id.progressBarNigeria);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-nigeria_1401-188.jpg")
                .into(imageViewNigeria, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarNigeria.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarNigeria.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}