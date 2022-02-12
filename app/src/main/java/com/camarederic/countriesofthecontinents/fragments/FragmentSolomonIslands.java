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


public class FragmentSolomonIslands extends Fragment {


    public static FragmentSolomonIslands newInstance() {
        return new FragmentSolomonIslands();
    }

    private ImageView imageViewSolomonIslands;
    private ProgressBar progressBarSolomonIslands;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_solomon_islands, container, false);

        imageViewSolomonIslands = view.findViewById(R.id.imageViewSolomonIslands);
        progressBarSolomonIslands = view.findViewById(R.id.progressBarSolomonIslands);

        Picasso.get().load("https://media.istockphoto.com/photos/solomon-islands-flag-picture-" +
                "id1180031625?k=20&m=1180031625&s=612x612&w=0&h=Dkch7MewemhTBUUN2TrtnM5osZ61tW_So3VxgikfXUw=")
                .into(imageViewSolomonIslands, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarSolomonIslands.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSolomonIslands.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}