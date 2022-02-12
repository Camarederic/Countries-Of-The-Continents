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


public class FragmentKuwait extends Fragment {


    public static FragmentKuwait newInstance() {
        return new FragmentKuwait();
    }

    private ImageView imageViewKuwait;
    private ProgressBar progressBarKuwait;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_kuwait, container, false);

        imageViewKuwait = view.findViewById(R.id.imageViewKuwait);
        progressBarKuwait = view.findViewById(R.id.progressBarKuwait);

        Picasso.get().load("https://image.freepik.com/fotos-gratis/bandeira-do-kuwait_1401-149.jpg")
                .into(imageViewKuwait, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarKuwait.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarKuwait.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}