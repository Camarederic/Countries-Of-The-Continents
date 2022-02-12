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


public class FragmentAustralianAntarcticTerritory extends Fragment {


    public static FragmentAustralianAntarcticTerritory newInstance(){
        return new FragmentAustralianAntarcticTerritory();
    }

    private ImageView imageViewAustralianAntarcticTerritory;
    private ProgressBar progressBarAustralianAntarcticTerritory;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_australian_antarctic_territory,container,false);

        imageViewAustralianAntarcticTerritory = view.findViewById(R.id.imageViewAustralianAntarcticTerritory);
        progressBarAustralianAntarcticTerritory = view.findViewById(R.id.progressBarAustralianAntarcticTerritory);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/" +
                "Flag_of_Australia_%28converted%29.svg/1920px-Flag_of_Australia_%28converted%29.svg.png")
                .into(imageViewAustralianAntarcticTerritory, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarAustralianAntarcticTerritory.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarAustralianAntarcticTerritory.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}