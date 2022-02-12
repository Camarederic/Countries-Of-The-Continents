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


public class FragmentEurope extends Fragment {

    public static FragmentEurope newInstance(){
        return new FragmentEurope();
    }

    private ImageView imageViewEurope;
    private ProgressBar progressBarEurope;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_europe,container,false);

        imageViewEurope = view.findViewById(R.id.imageViewEurope);
        progressBarEurope = view.findViewById(R.id.progressBarEurope);

        Picasso.get().load("https://www.whatarethe7continents.com/wp-content/uploads/2011/12/continent-of-europe.png")
                .into(imageViewEurope, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarEurope.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarEurope.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}