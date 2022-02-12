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


public class FragmentMontserrat extends Fragment {

    public static FragmentMontserrat newInstance() {
        return new FragmentMontserrat();
    }

    private ImageView imageViewMontserrat;
    private ProgressBar progressBarMontserrat;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_montserrat, container, false);

        imageViewMontserrat = view.findViewById(R.id.imageViewMontserrat);
        progressBarMontserrat = view.findViewById(R.id.progressBarMontserrat);

        Picasso.get().load("https://ak.picdn.net/shutterstock/videos/1014746999/thumb/1.jpg?ip=x480")
                .into(imageViewMontserrat, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarMontserrat.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMontserrat.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}