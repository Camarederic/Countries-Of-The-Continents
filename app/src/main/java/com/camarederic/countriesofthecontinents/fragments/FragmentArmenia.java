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


public class FragmentArmenia extends Fragment {

    public static FragmentArmenia newInstance(){
        return new FragmentArmenia();
    }

    private ImageView imageViewArmenia;
    private ProgressBar progressBarArmenia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_armenia, container, false);

        imageViewArmenia = view.findViewById(R.id.imageViewArmenia);
        progressBarArmenia = view.findViewById(R.id.progressBarArmenia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-armenia_1401-58.jpg")
                .into(imageViewArmenia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarArmenia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarArmenia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}