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


public class FragmentMarshallIslands extends Fragment {


    public static FragmentMarshallIslands newInstance(){
        return new FragmentMarshallIslands();
    }

    private ImageView imageViewMarshallIslands;
    private ProgressBar progressBarMarshallIslands;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_marshall_islands,container,false);

        imageViewMarshallIslands = view.findViewById(R.id.imageViewMarshallIslands);
        progressBarMarshallIslands = view.findViewById(R.id.progressBarMarshallIslands);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-marshall-islands_1401-168.jpg")
                .into(imageViewMarshallIslands, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarMarshallIslands.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMarshallIslands.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}