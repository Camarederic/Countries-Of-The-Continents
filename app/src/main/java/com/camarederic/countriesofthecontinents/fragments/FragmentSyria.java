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


public class FragmentSyria extends Fragment {


    public static FragmentSyria newInstance() {
        return new FragmentSyria();
    }

    private ImageView imageViewSyria;
    private ProgressBar progressBarSyria;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_syria, container, false);

        imageViewSyria = view.findViewById(R.id.imageViewSyria);
        progressBarSyria = view.findViewById(R.id.progressBarSyria);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-syria_1401-236.jpg")
                .into(imageViewSyria, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarSyria.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSyria.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}