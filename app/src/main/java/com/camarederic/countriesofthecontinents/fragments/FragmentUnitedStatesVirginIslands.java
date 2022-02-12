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


public class FragmentUnitedStatesVirginIslands extends Fragment {

    public static FragmentUnitedStatesVirginIslands newInstance() {
        return new FragmentUnitedStatesVirginIslands();
    }

    private ImageView imageViewUnitedStatesVirginIslands;
    private ProgressBar progressBarUnitedStatesVirginIslands;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_united_states_virgin_islands, container, false);

        imageViewUnitedStatesVirginIslands = view.findViewById(R.id.imageViewUnitedStatesVirginIslands);
        progressBarUnitedStatesVirginIslands = view.findViewById(R.id.progressBarUnitedStatesVirginIslands);

        Picasso.get().load("https://www.deeperblue.com/wp-content/uploads/2019/08/AdobeStock_154331266.jpeg")
                .into(imageViewUnitedStatesVirginIslands, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarUnitedStatesVirginIslands.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarUnitedStatesVirginIslands.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}