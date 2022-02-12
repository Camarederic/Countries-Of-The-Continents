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


public class FragmentDominicanRepublic extends Fragment {

    public static FragmentDominicanRepublic newInstance(){
        return new FragmentDominicanRepublic();
    }

    private ImageView imageViewDominicanRepublic;
    private ProgressBar progressBarDominicanRepublic;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dominican_republic, container, false);

        imageViewDominicanRepublic = view.findViewById(R.id.imageViewDominicanRepublic);
        progressBarDominicanRepublic = view.findViewById(R.id.progressBarDominicanRepublic);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-dominican-republic_1401-102.jpg")
                .into(imageViewDominicanRepublic, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarDominicanRepublic.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarDominicanRepublic.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}