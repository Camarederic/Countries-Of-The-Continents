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


public class FragmentArmenia_2 extends Fragment {

    public static FragmentArmenia_2 newInstance(){
        return new FragmentArmenia_2();
    }

    private ImageView imageViewArmenia_2;
    private ProgressBar progressBarArmenia_2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_armenia_2, container, false);

        imageViewArmenia_2 = view.findViewById(R.id.imageViewArmenia_2);
        progressBarArmenia_2 = view.findViewById(R.id.progressBarArmenia_2);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-armenia_1401-58.jpg")
                .into(imageViewArmenia_2, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarArmenia_2.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarArmenia_2.setVisibility(View.INVISIBLE);
                    }
                });
        return view;
    }
}