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


public class FragmentChileanAntarcticTerritory extends Fragment {

    public static FragmentChileanAntarcticTerritory newInstance(){
        return new FragmentChileanAntarcticTerritory();
    }

    private ImageView imageViewChileanAntarcticTerritory;
    private ProgressBar progressBarChileanAntarcticTerritory;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_chilean_antarctic_territory,container,false);

        imageViewChileanAntarcticTerritory = view.findViewById(R.id.imageViewChileanAntarcticTerritory);
        progressBarChileanAntarcticTerritory = view.findViewById(R.id.progressBarChileanAntarcticTerritory);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/" +
                "Flag_of_Magallanes%2C_Chile.svg/1920px-Flag_of_Magallanes%2C_Chile.svg.png")
                .into(imageViewChileanAntarcticTerritory, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarChileanAntarcticTerritory.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarChileanAntarcticTerritory.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}