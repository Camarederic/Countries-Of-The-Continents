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


public class FragmentNepal extends Fragment {

    public static FragmentNepal newInstance() {
        return new FragmentNepal();
    }

    private ImageView imageViewNepal;
    private ProgressBar progressBarNepal;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_nepal, container, false);

        imageViewNepal = view.findViewById(R.id.imageViewNepal);
        progressBarNepal = view.findViewById(R.id.progressBarNepal);

        Picasso.get().load("https://astromagicmoon.ru/wp-content/uploads/2019/11/nepal.jpg")
                .into(imageViewNepal, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarNepal.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarNepal.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}