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


public class FragmentBolivia extends Fragment {

    public static FragmentBolivia newInstance(){
        return new FragmentBolivia();
    }

    private ImageView imageViewBolivia;
    private ProgressBar progressBarBolivia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bolivia, container, false);

        imageViewBolivia = view.findViewById(R.id.imageViewBolivia);
        progressBarBolivia = view.findViewById(R.id.progressBarBolivia);

        Picasso.get().load("https://rus.team/images/article/55211/avatar_4x3.webp?actual=1597615020")
                .into(imageViewBolivia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarBolivia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBolivia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}