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


public class FragmentReunion extends Fragment {

    public static FragmentReunion newInstance() {
        return new FragmentReunion();
    }

    private ImageView imageViewReunion;
    private ProgressBar progressBarReunion;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_reunion, container, false);

        imageViewReunion = view.findViewById(R.id.imageViewReunion);
        progressBarReunion = view.findViewById(R.id.progressBarReunion);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/" +
                "thumb/3/39/Armoiries_R%C3%A9union.svg/1200px-Armoiries_R%C3%A9union.svg.png")
                .into(imageViewReunion, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarReunion.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarReunion.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}