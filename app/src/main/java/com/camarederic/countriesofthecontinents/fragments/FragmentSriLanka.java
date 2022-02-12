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


public class FragmentSriLanka extends Fragment {


    public static FragmentSriLanka newInstance(){
        return new FragmentSriLanka();
    }

    private ImageView imageViewSriLanka;
    private ProgressBar progressBarSriLanka;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sri_lanka,container,false);

        imageViewSriLanka = view.findViewById(R.id.imageViewSriLanka);
        progressBarSriLanka = view.findViewById(R.id.progressBarSriLanka);

        Picasso.get().load("https://wallpaperaccess.com/full/2714480.jpg")
                .into(imageViewSriLanka, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarSriLanka.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSriLanka.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}