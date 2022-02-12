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


public class FragmentAndorra extends Fragment {


    public static FragmentAndorra newInstance(){
        return new FragmentAndorra();
    }

    private ImageView imageViewAndorra;
    private ProgressBar progressBarAndorra;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_andorra, container, false);

        imageViewAndorra = view.findViewById(R.id.imageViewAndorra);
        progressBarAndorra = view.findViewById(R.id.progressBarAndorra);

        Picasso.get().load("https://cdn.pixabay.com/photo/2017/12/23/23/24/andorra-3036176_960_720.jpg")
                .into(imageViewAndorra, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarAndorra.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarAndorra.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}