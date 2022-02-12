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


public class FragmentSierraLeone extends Fragment {

    public static FragmentSierraLeone newInstance() {
        return new FragmentSierraLeone();
    }

    private ImageView imageViewSierraLeone;
    private ProgressBar progressBarSierraLeone;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sierra_leone, container, false);

        imageViewSierraLeone = view.findViewById(R.id.imageViewSierraLeone);
        progressBarSierraLeone = view.findViewById(R.id.progressBarSierraLeone);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-sierra-leone_1401-219.jpg")
                .into(imageViewSierraLeone, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSierraLeone.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSierraLeone.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}