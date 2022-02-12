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


public class FragmentCuba extends Fragment {

    public static FragmentCuba newInstance(){
        return new FragmentCuba();
    }

    private ImageView imageViewCuba;
    private ProgressBar progressBarCuba;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cuba, container, false);

        imageViewCuba = view.findViewById(R.id.imageViewCuba);
        progressBarCuba = view.findViewById(R.id.progressBarCuba);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-cuba_1401-96.jpg")
                .into(imageViewCuba, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarCuba.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarCuba.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}