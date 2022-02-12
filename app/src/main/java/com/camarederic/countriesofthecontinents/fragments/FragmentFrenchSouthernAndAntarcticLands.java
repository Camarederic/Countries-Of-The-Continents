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


public class FragmentFrenchSouthernAndAntarcticLands extends Fragment {

    public static FragmentFrenchSouthernAndAntarcticLands newInstance(){
        return new FragmentFrenchSouthernAndAntarcticLands();
    }

    private ImageView imageViewFrenchSouthernAndAntarcticLands;
    private ProgressBar progressBarFrenchSouthernAndAntarcticLands;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_french_southern_and_antarctic_lands, container, false);

        imageViewFrenchSouthernAndAntarcticLands = view.findViewById(R.id.imageViewFrenchSouthernAndAntarcticLands);
        progressBarFrenchSouthernAndAntarcticLands = view.findViewById(R.id.progressBarFrenchSouthernAndAntarcticLands);

        Picasso.get().load("https://ak.picdn.net/shutterstock/videos/1015086451/thumb/1.jpg?ip=x480")
                .into(imageViewFrenchSouthernAndAntarcticLands, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarFrenchSouthernAndAntarcticLands.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarFrenchSouthernAndAntarcticLands.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }

}