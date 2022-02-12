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


public class FragmentUnitedArabEmirates extends Fragment {


    public static FragmentUnitedArabEmirates newInstance() {
        return new FragmentUnitedArabEmirates();
    }

    private ImageView imageViewUnitedArabEmirates;
    private ProgressBar progressBarUnitedArabEmirates;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_united_arab_emirates, container, false);

        imageViewUnitedArabEmirates = view.findViewById(R.id.imageViewUnitedArabEmirates);
        progressBarUnitedArabEmirates = view.findViewById(R.id.progressBarUnitedArabEmirates);

        Picasso.get().load("https://militaryarms.ru/wp-content/uploads/2021/08/56d5ecaccddbbb244ecc45eecb5f9ce9.jpg")
                .into(imageViewUnitedArabEmirates, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarUnitedArabEmirates.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarUnitedArabEmirates.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}