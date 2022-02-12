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


public class FragmentCostaRica extends Fragment {

    public static FragmentCostaRica newInstance(){
        return new FragmentCostaRica();
    }

    private ImageView imageViewCostaRica;
    private ProgressBar progressBarCostaRica;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_costa_rica, container, false);

        imageViewCostaRica = view.findViewById(R.id.imageViewCostaRica);
        progressBarCostaRica = view.findViewById(R.id.progressBarCostaRica);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-costa-rica-with-ensign_1401-110.jpg")
                .into(imageViewCostaRica, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarCostaRica.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarCostaRica.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}