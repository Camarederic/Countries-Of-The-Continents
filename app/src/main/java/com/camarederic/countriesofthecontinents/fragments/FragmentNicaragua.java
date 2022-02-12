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


public class FragmentNicaragua extends Fragment {

    public static FragmentNicaragua newInstance() {
        return new FragmentNicaragua();
    }

    private ImageView imageViewNicaragua;
    private ProgressBar progressBarNicaragua;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_nicaragua, container, false);

        imageViewNicaragua = view.findViewById(R.id.imageViewNicaragua);
        progressBarNicaragua = view.findViewById(R.id.progressBarNicaragua);

        Picasso.get().load("https://image.freepik.com/fotos-gratis/bandeira-da-nicaragua_1401-186.jpg")
                .into(imageViewNicaragua, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarNicaragua.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarNicaragua.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}