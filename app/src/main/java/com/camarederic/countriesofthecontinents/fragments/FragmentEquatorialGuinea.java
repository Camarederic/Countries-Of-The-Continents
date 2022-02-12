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


public class FragmentEquatorialGuinea extends Fragment {

    public static FragmentEquatorialGuinea newInstance(){
        return new FragmentEquatorialGuinea();
    }

    private ImageView imageViewEquatorialGuinea;
    private ProgressBar progressBarEquatorialGuinea;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_equatorial_guinea, container, false);

        imageViewEquatorialGuinea = view.findViewById(R.id.imageViewEquatorialGuinea);
        progressBarEquatorialGuinea = view.findViewById(R.id.progressBarEquatorialGuinea);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-equatorial-guinea_1401-107.jpg")
                .into(imageViewEquatorialGuinea, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarEquatorialGuinea.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarEquatorialGuinea.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}