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


public class FragmentMelilla extends Fragment {

    public static FragmentMelilla newInstance() {
        return new FragmentMelilla();
    }

    private ImageView imageViewMelilla;
    private ProgressBar progressBarMelilla;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_melilla, container, false);

        imageViewMelilla = view.findViewById(R.id.imageViewMelilla);
        progressBarMelilla = view.findViewById(R.id.progressBarMelilla);

        Picasso.get().load("https://st4.depositphotos.com/12417518/39878/i/600/" +
                "depositphotos_398780598-stock-photo-melilla-of-spain-flag-on.jpg")
                .into(imageViewMelilla, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarMelilla.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMelilla.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}