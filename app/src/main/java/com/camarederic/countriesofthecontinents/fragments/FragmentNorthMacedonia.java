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


public class FragmentNorthMacedonia extends Fragment {


    public static FragmentNorthMacedonia newInstance() {
        return new FragmentNorthMacedonia();
    }

    private ImageView imageViewNorthMacedonia;
    private ProgressBar progressBarNorthMacedonia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_north_macedonia, container, false);

        imageViewNorthMacedonia = view.findViewById(R.id.imageViewNorthMacedonia);
        progressBarNorthMacedonia = view.findViewById(R.id.progressBarNorthMacedonia);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-republic-of-macedonia_1401-161.jpg")
                .into(imageViewNorthMacedonia, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarNorthMacedonia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarNorthMacedonia.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}