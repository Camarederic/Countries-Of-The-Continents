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


public class FragmentCeuta extends Fragment {

    public static FragmentCeuta newInstance(){
        return new FragmentCeuta();
    }

    private ImageView imageViewCeuta;
    private ProgressBar progressBarCeuta;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ceuta, container, false);

        imageViewCeuta = view.findViewById(R.id.imageViewCeuta);
        progressBarCeuta = view.findViewById(R.id.progressBarCeuta);

        Picasso.get().load("https://flagi-1.ru/wp-content/uploads/2016/10/es-ce-1.png")
                .into(imageViewCeuta, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarCeuta.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarCeuta.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}