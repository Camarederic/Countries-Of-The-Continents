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


public class FragmentAlbania extends Fragment {

    public static FragmentAlbania newInstance(){
        return new FragmentAlbania();
    }

    private ImageView imageViewAlbania;
    private ProgressBar progressBarAlbania;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_albania, container, false);

        imageViewAlbania = view.findViewById(R.id.imageViewAlbania);
        progressBarAlbania = view.findViewById(R.id.progressBarAlbania);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-albania_1401-51.jpg")
                .into(imageViewAlbania, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarAlbania.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarAlbania.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}