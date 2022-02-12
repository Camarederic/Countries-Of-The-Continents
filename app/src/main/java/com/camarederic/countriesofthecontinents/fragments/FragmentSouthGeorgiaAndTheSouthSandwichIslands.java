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


public class FragmentSouthGeorgiaAndTheSouthSandwichIslands extends Fragment {

    public static FragmentSouthGeorgiaAndTheSouthSandwichIslands newInstance() {
        return new FragmentSouthGeorgiaAndTheSouthSandwichIslands();
    }

    private ImageView imageViewSouthGeorgiaAndTheSouthSandwichIslands;
    private ProgressBar progressBarSouthGeorgiaAndTheSouthSandwichIslands;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_south_georgia_and_the_south_sandwich_islands, container, false);

        imageViewSouthGeorgiaAndTheSouthSandwichIslands = view.findViewById(R.id.imageViewSouthGeorgiaAndTheSouthSandwichIslands);
        progressBarSouthGeorgiaAndTheSouthSandwichIslands = view.findViewById(R.id.progressBarSouthGeorgiaAndTheSouthSandwichIslands);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Flag_of_South_Georgia_and_the_" +
                "South_Sandwich_Islands.svg/2560px-Flag_of_South_Georgia_and_the_South_Sandwich_Islands.svg.png")
                .into(imageViewSouthGeorgiaAndTheSouthSandwichIslands, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSouthGeorgiaAndTheSouthSandwichIslands.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSouthGeorgiaAndTheSouthSandwichIslands.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}