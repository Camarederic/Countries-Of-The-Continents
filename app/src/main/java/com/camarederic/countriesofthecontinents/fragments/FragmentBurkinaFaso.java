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


public class FragmentBurkinaFaso extends Fragment {

    public static FragmentBurkinaFaso newInstance(){
        return new FragmentBurkinaFaso();
    }

    private ImageView imageViewBurkinaFaso;
    private ProgressBar progressBarBurkinaFaso;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_burkina_faso, container, false);

        imageViewBurkinaFaso = view.findViewById(R.id.imageViewBurkinaFaso);
        progressBarBurkinaFaso = view.findViewById(R.id.progressBarBurkinaFaso);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-burkina-faso_1401-80.jpg")
                .into(imageViewBurkinaFaso, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarBurkinaFaso.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBurkinaFaso.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}