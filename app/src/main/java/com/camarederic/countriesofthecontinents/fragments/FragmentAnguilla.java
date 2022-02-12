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


public class FragmentAnguilla extends Fragment {

    public static FragmentAnguilla newInstance(){
        return new FragmentAnguilla();
    }

    private ImageView imageViewAnguilla;
    private ProgressBar progressBarAnguilla;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_anguilla, container, false);

        imageViewAnguilla = view.findViewById(R.id.imageViewAnguilla);
        progressBarAnguilla = view.findViewById(R.id.progressBarAnguilla);

        Picasso.get().load("https://st3.depositphotos.com/12417518/36969/i/600/" +
                "depositphotos_369693870-stock-photo-anguilla-flag-on-the-fabric.jpg")
                .into(imageViewAnguilla, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarAnguilla.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarAnguilla.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}