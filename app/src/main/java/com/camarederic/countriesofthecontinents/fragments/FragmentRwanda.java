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


public class FragmentRwanda extends Fragment {

    public static FragmentRwanda newInstance() {
        return new FragmentRwanda();
    }

    private ImageView imageViewRwanda;
    private ProgressBar progressBarRwanda;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_rwanda, container, false);

        imageViewRwanda = view.findViewById(R.id.imageViewRwanda);
        progressBarRwanda = view.findViewById(R.id.progressBarRwanda);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-rwanda_1401-208.jpg")
                .into(imageViewRwanda, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarRwanda.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarRwanda.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}