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


public class FragmentAlgeria extends Fragment {

    public static FragmentAlgeria newInstance(){
        return new FragmentAlgeria();
    }

    private ImageView imageViewAlgeria;
    private ProgressBar progressBarAlgeria;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_algeria, container, false);

        imageViewAlgeria = view.findViewById(R.id.imageViewAlgeria);
        progressBarAlgeria = view.findViewById(R.id.progressBarAlgeria);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-algeria_1401-52.jpg")
                .into(imageViewAlgeria, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarAlgeria.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarAlgeria.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }


}