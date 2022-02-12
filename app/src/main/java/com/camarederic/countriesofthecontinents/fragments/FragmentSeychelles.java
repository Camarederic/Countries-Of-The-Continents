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


public class FragmentSeychelles extends Fragment {

    public static FragmentSeychelles newInstance() {
        return new FragmentSeychelles();
    }

    private ImageView imageViewSeychelles;
    private ProgressBar progressBarSeychelles;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_seychelles, container, false);

        imageViewSeychelles = view.findViewById(R.id.imageViewSeychelles);
        progressBarSeychelles = view.findViewById(R.id.progressBarSeychelles);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-seychelles_1401-218.jpg")
                .into(imageViewSeychelles, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSeychelles.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSeychelles.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}