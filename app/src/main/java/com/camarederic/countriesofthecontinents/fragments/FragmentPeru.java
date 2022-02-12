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


public class FragmentPeru extends Fragment {

    public static FragmentPeru newInstance() {
        return new FragmentPeru();
    }

    private ImageView imageViewPeru;
    private ProgressBar progressBarPeru;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_peru, container, false);

        imageViewPeru = view.findViewById(R.id.imageViewPeru);
        progressBarPeru = view.findViewById(R.id.progressBarPeru);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-peru-silk-close-up_406939-899.jpg")
                .into(imageViewPeru, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarPeru.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarPeru.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}