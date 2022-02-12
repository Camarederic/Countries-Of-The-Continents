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


public class FragmentBelize extends Fragment {

    public static FragmentBelize newInstance(){
        return new FragmentBelize();
    }

    private ImageView imageViewBelize;
    private ProgressBar progressBarBelize;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_belize, container, false);

        imageViewBelize = view.findViewById(R.id.imageViewBelize);
        progressBarBelize = view.findViewById(R.id.progressBarBelize);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-belize_1401-70.jpg")
                .into(imageViewBelize, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarBelize.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBelize.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}