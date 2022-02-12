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


public class FragmentMauritania extends Fragment {

    public static FragmentMauritania newInstance() {
        return new FragmentMauritania();
    }

    private ImageView imageViewMauritania;
    private ProgressBar progressBarMauritania;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mauritania, container, false);

        imageViewMauritania = view.findViewById(R.id.imageViewMauritania);
        progressBarMauritania = view.findViewById(R.id.progressBarMauritania);

        Picasso.get().load("https://media.istockphoto.com/photos/mauritania-flag-waving-flag-of-mauritania-3d-illustration-nouakchott-" +
                "picture-id1089024248?k=20&m=1089024248&s=170667a&w=0&h=zWd6ikmvghFc6bFnxW0lALFVD4vXmsNO9m2ExF4mbcE=")
                .into(imageViewMauritania, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarMauritania.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMauritania.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}