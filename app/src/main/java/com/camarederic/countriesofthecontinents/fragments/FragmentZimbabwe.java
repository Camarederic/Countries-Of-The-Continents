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


public class FragmentZimbabwe extends Fragment {

    public static FragmentZimbabwe newInstance() {
        return new FragmentZimbabwe();
    }

    private ImageView imageViewZimbabwe;
    private ProgressBar progressBarZimbabwe;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_zimbabwe, container, false);

        imageViewZimbabwe = view.findViewById(R.id.imageViewZimbabwe);
        progressBarZimbabwe = view.findViewById(R.id.progressBarZimbabwe);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-zimbabwe_1401-261.jpg")
                .into(imageViewZimbabwe, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarZimbabwe.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarZimbabwe.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}