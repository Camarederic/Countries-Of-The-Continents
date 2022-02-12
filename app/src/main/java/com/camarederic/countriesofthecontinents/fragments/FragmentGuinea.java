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


public class FragmentGuinea extends Fragment {

    public static FragmentGuinea newInstance() {
        return new FragmentGuinea();
    }

    private ImageView imageViewGuinea;
    private ProgressBar progressBarGuinea;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_guinea, container, false);

        imageViewGuinea = view.findViewById(R.id.imageViewGuinea);
        progressBarGuinea = view.findViewById(R.id.progressBarGuinea);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-guinea_1401-124.jpg")
                .into(imageViewGuinea, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarGuinea.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarGuinea.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}