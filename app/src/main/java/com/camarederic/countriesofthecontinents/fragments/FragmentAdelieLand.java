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


public class FragmentAdelieLand extends Fragment {


    public static FragmentAdelieLand newInstance() {
        return new FragmentAdelieLand();
    }

    private ImageView imageViewAdelieLand;
    private ProgressBar progressBarAdelieLand;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_adelie_land, container, false);

        imageViewAdelieLand = view.findViewById(R.id.imageViewAdelieLand);
        progressBarAdelieLand = view.findViewById(R.id.progressBarAdelieLand);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/Flag_of_the_French_Southern_" +
                "and_Antarctic_Lands.svg/640px-Flag_of_the_French_Southern_and_Antarctic_Lands.svg.png")
                .into(imageViewAdelieLand, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarAdelieLand.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarAdelieLand.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}