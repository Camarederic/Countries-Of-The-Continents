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


public class FragmentBhutan extends Fragment {

    public static FragmentBhutan newInstance(){
        return new FragmentBhutan();
    }

    private ImageView imageViewBhutan;
    private ProgressBar progressBarBhutan;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bhutan, container, false);

        imageViewBhutan = view.findViewById(R.id.imageViewBhutan);
        progressBarBhutan = view.findViewById(R.id.progressBarBhutan);

        Picasso.get().load("https://images7.alphacoders.com/292/thumb-1920-292400.jpg")
                .into(imageViewBhutan, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarBhutan.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBhutan.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}