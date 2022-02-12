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


public class FragmentIreland extends Fragment {

    public static FragmentIreland newInstance() {
        return new FragmentIreland();
    }

    private ImageView imageViewIreland;
    private ProgressBar progressBarIreland;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ireland, container, false);

        imageViewIreland = view.findViewById(R.id.imageViewIreland);
        progressBarIreland = view.findViewById(R.id.progressBarIreland);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-ireland_1401-136.jpg")
                .into(imageViewIreland, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarIreland.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarIreland.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}