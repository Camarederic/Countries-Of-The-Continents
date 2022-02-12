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


public class FragmentNiger extends Fragment {

    public static FragmentNiger newInstance() {
        return new FragmentNiger();
    }

    private ImageView imageViewNiger;
    private ProgressBar progressBarNiger;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_niger, container, false);

        imageViewNiger = view.findViewById(R.id.imageViewNiger);
        progressBarNiger = view.findViewById(R.id.progressBarNiger);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-niger_1401-187.jpg")
                .into(imageViewNiger, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarNiger.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarNiger.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}