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


public class FragmentVenezuela extends Fragment {

    public static FragmentVenezuela newInstance() {
        return new FragmentVenezuela();
    }

    private ImageView imageViewVenezuela;
    private ProgressBar progressBarVenezuela;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_venezuela, container, false);

        imageViewVenezuela = view.findViewById(R.id.imageViewVenezuela);
        progressBarVenezuela = view.findViewById(R.id.progressBarVenezuela);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-venezuela_1401-258.jpg")
                .into(imageViewVenezuela, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarVenezuela.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarVenezuela.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}