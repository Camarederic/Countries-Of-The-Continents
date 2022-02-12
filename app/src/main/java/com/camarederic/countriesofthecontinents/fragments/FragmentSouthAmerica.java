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


public class FragmentSouthAmerica extends Fragment {

    public static FragmentSouthAmerica newInstance(){
        return new FragmentSouthAmerica();
    }

    private ImageView imageViewSouthAmerica;
    private ProgressBar progressBarSouthAmerica;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_south_america,container,false);

        imageViewSouthAmerica = view.findViewById(R.id.imageViewSouthAmerica);
        progressBarSouthAmerica = view.findViewById(R.id.progressBarSouthAmerica);

        Picasso.get().load("https://d3jlfsfsyc6yvi.cloudfront.net/image/mw:1024/q:85/https%3A%2F%2Fhaygot." +
                "s3.amazonaws.com%3A443%2Fcheatsheet%2F29807_7d9847e0d27a4ac9b8b60cbb8880e2c1.png")
                .into(imageViewSouthAmerica, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarSouthAmerica.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSouthAmerica.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}