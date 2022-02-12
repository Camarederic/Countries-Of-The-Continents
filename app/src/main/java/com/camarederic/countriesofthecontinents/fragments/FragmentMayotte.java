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


public class FragmentMayotte extends Fragment {

    public static FragmentMayotte newInstance() {
        return new FragmentMayotte();
    }

    private ImageView imageViewMayotte;
    private ProgressBar progressBarMayotte;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mayotte, container, false);

        imageViewMayotte = view.findViewById(R.id.imageViewMayotte);
        progressBarMayotte = view.findViewById(R.id.progressBarMayotte);

        Picasso.get().load("https://puzzleit.ru/files/puzzles/38/37997/_original.jpg")
                .into(imageViewMayotte, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarMayotte.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMayotte.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }

}