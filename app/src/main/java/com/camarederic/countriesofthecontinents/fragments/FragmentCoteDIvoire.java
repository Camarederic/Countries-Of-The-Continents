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


public class FragmentCoteDIvoire extends Fragment {

    public static FragmentCoteDIvoire newInstance(){
        return new FragmentCoteDIvoire();
    }

    private ImageView imageViewCoteDIvoire;
    private ProgressBar progressBarCoteDIvoire;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cote_d_ivoire, container, false);

        imageViewCoteDIvoire = view.findViewById(R.id.imageViewCoteDIvoire);
        progressBarCoteDIvoire = view.findViewById(R.id.progressBarCoteDIvoire);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-ivory-coast_1401-138.jpg")
                .into(imageViewCoteDIvoire, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarCoteDIvoire.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarCoteDIvoire.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}