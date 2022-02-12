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


public class FragmentNorthKorea extends Fragment {


    public static FragmentNorthKorea newInstance() {
        return new FragmentNorthKorea();
    }

    private ImageView imageViewNorthKorea;
    private ProgressBar progressBarNorthKorea;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_north_korea, container, false);

        imageViewNorthKorea = view.findViewById(R.id.imageViewNorthKorea);
        progressBarNorthKorea = view.findViewById(R.id.progressBarNorthKorea);

        Picasso.get().load("https://ak.picdn.net/shutterstock/videos/1060440859/thumb/1.jpg")
                .into(imageViewNorthKorea, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarNorthKorea.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarNorthKorea.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}