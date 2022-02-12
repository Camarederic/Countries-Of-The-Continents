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


public class FragmentMaldives extends Fragment {


    public static FragmentMaldives newInstance() {
        return new FragmentMaldives();
    }

    private ImageView imageViewMaldives;
    private ProgressBar progressBarMaldives;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_maldives, container, false);

        imageViewMaldives = view.findViewById(R.id.imageViewMaldives);
        progressBarMaldives = view.findViewById(R.id.progressBarMaldives);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-maldives_1401-165.jpg")
                .into(imageViewMaldives, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarMaldives.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMaldives.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}