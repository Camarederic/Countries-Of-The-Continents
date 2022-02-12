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


public class FragmentNorthAmerica extends Fragment {


    public static FragmentNorthAmerica newInstance(){
        return new FragmentNorthAmerica();
    }

    private ImageView imageViewNorthAmerica;
    private ProgressBar progressBarNorthAmerica;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_north_america,container,false);

        imageViewNorthAmerica = view.findViewById(R.id.imageViewNorthAmerica);
        progressBarNorthAmerica = view.findViewById(R.id.progressBarNorthAmerica);

        Picasso.get().load("https://d3jlfsfsyc6yvi.cloudfront.net/image/mw:1024/q:85/https%3A%2F%2Fhaygot." +
                "s3.amazonaws.com%3A443%2Fcheatsheet%2F29803_00cb08dec3ff49ba9f00a8d42f66adcc.png")
                .into(imageViewNorthAmerica, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarNorthAmerica.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarNorthAmerica.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}