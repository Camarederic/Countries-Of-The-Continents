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


public class FragmentIceland extends Fragment {


    public static FragmentIceland newInstance() {
        return new FragmentIceland();
    }

    private ImageView imageViewIceland;
    private ProgressBar progressBarIceland;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_iceland, container, false);

        imageViewIceland = view.findViewById(R.id.imageViewIceland);
        progressBarIceland = view.findViewById(R.id.progressBarIceland);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-iceland_1401-131.jpg")
                .into(imageViewIceland, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarIceland.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarIceland.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}