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


public class FragmentSlovenia extends Fragment {

    public static FragmentSlovenia newInstance() {
        return new FragmentSlovenia();
    }

    private ImageView imageViewSlovenia;
    private ProgressBar progressBarSlovenia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_slovenia, container, false);

        imageViewSlovenia = view.findViewById(R.id.imageViewSlovenia);
        progressBarSlovenia = view.findViewById(R.id.progressBarSlovenia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-slovenia_1401-223.jpg")
                .into(imageViewSlovenia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSlovenia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSlovenia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}