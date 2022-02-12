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


public class FragmentBritishAntarcticTerritory extends Fragment {


    public static FragmentBritishAntarcticTerritory newInstance(){
        return new FragmentBritishAntarcticTerritory();
    }

    private ImageView imageViewBritishAntarcticTerritory;
    private ProgressBar progressBarBritishAntarcticTerritory;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_british_antarctic_territory,container,false);

        imageViewBritishAntarcticTerritory = view.findViewById(R.id.imageViewBritishAntarcticTerritory);
        progressBarBritishAntarcticTerritory = view.findViewById(R.id.progressBarBritishAntarcticTerritory);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Flag_of_the_British_Antarctic_Territory.svg/" +
                "1024px-Flag_of_the_British_Antarctic_Territory.svg.png")
                .into(imageViewBritishAntarcticTerritory, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarBritishAntarcticTerritory.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBritishAntarcticTerritory.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}