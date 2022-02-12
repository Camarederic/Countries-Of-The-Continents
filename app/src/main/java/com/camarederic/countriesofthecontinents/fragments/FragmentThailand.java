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


public class FragmentThailand extends Fragment {


    public static FragmentThailand newInstance() {
        return new FragmentThailand();
    }

    private ImageView imageViewThailand;
    private ProgressBar progressBarThailand;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_thailand, container, false);

        imageViewThailand = view.findViewById(R.id.imageViewThailand);
        progressBarThailand = view.findViewById(R.id.progressBarThailand);

        Picasso.get().load("https://www.eccobandeiras.com.br/image/cache/catalog/Tailandia-800x533.jpg")
                .into(imageViewThailand, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarThailand.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarThailand.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}