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


public class FragmentAntarctica extends Fragment {


    public static FragmentAntarctica newInstance(){
        return new FragmentAntarctica();
    }

    private ImageView imageViewAntarctica;
    private ProgressBar progressBarAntarctica;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_antarctica,container,false);

        imageViewAntarctica = view.findViewById(R.id.imageViewAntarctica);
        progressBarAntarctica = view.findViewById(R.id.progressBarAntarctica);

        Picasso.get().load("https://ak.picdn.net/shutterstock/videos/1050127/thumb/1.jpg")
                .into(imageViewAntarctica, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarAntarctica.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarAntarctica.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}