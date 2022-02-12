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


public class FragmentJordan extends Fragment {

    public static FragmentJordan newInstance() {
        return new FragmentJordan();
    }

    private ImageView imageViewJordan;
    private ProgressBar progressBarJordan;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_jordan, container, false);

        imageViewJordan = view.findViewById(R.id.imageViewJordan);
        progressBarJordan = view.findViewById(R.id.progressBarJordan);

        Picasso.get().load("https://ak.picdn.net/shutterstock/videos/248725/thumb/1.jpg")
                .into(imageViewJordan, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarJordan.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarJordan.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}