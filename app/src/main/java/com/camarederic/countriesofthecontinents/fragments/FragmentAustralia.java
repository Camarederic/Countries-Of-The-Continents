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


public class FragmentAustralia extends Fragment {


    public static FragmentAustralia newInstance(){
        return new FragmentAustralia();
    }

    private ImageView imageViewAustralia;
    private ProgressBar progressBarAustralia;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_australia,container,false);

        imageViewAustralia = view.findViewById(R.id.imageViewAustralia);
        progressBarAustralia = view.findViewById(R.id.progressBarAustralia);

        Picasso.get().load("https://militaryarms.ru/wp-content/uploads/2021/08/7-1.jpg")
                .into(imageViewAustralia, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarAustralia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(),Toast.LENGTH_SHORT).show();
                        progressBarAustralia.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}