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


public class FragmentQueenMaudLand extends Fragment {


    public static FragmentQueenMaudLand newInstance() {
        return new FragmentQueenMaudLand();
    }

    private ImageView imageViewQueenMaudLand;
    private ProgressBar progressBarQueenMaudLand;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_queen_maud_land, container, false);

        imageViewQueenMaudLand = view.findViewById(R.id.imageViewQueenMaudLand);
        progressBarQueenMaudLand = view.findViewById(R.id.progressBarQueenMaudLand);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-norway_1401-189.jpg")
                .into(imageViewQueenMaudLand, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarQueenMaudLand.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarQueenMaudLand.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}