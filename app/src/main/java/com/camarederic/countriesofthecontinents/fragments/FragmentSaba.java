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


public class FragmentSaba extends Fragment {

    public static FragmentSaba newInstance() {
        return new FragmentSaba();
    }

    private ImageView imageViewSaba;
    private ProgressBar progressBarSaba;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_saba, container, false);

        imageViewSaba = view.findViewById(R.id.imageViewSaba);
        progressBarSaba = view.findViewById(R.id.progressBarSaba);

        Picasso.get().load("https://atributia.ru/upload/iblock/7bc/7bc3a40f06e1bcbf200e2684d19d799c.png")
                .into(imageViewSaba, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSaba.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSaba.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}