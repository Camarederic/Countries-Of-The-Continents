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


public class FragmentTuvalu extends Fragment {

    public static FragmentTuvalu newInstance(){
        return new FragmentTuvalu();
    }

    private ImageView imageViewTuvalu;
    private ProgressBar progressBarTuvalu;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tuvalu,container,false);

        imageViewTuvalu = view.findViewById(R.id.imageViewTuvalu);
        progressBarTuvalu = view.findViewById(R.id.progressBarTuvalu);

        Picasso.get().load("https://image.freepik.com/fotos-kostenlos/flagge-von-tuvalu_1401-247.jpg")
                .into(imageViewTuvalu, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarTuvalu.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarTuvalu.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}