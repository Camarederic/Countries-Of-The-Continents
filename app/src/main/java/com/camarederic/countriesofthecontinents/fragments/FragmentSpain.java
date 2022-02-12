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


public class FragmentSpain extends Fragment {

    public static FragmentSpain newInstance() {
        return new FragmentSpain();
    }

    private ImageView imageViewSpain;
    private ProgressBar progressBarSpain;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_spain, container, false);

        imageViewSpain = view.findViewById(R.id.imageViewSpain);
        progressBarSpain = view.findViewById(R.id.progressBarSpain);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-spain_1401-228.jpg")
                .into(imageViewSpain, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSpain.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSpain.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}