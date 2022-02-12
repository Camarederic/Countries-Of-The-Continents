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


public class FragmentTurkey_2 extends Fragment {

    public static FragmentTurkey_2 newInstance(){
        return new FragmentTurkey_2();
    }

    private ImageView imageViewTurkey_2;
    private ProgressBar progressBarTurkey_2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_turkey_2,container,false);

        imageViewTurkey_2 = view.findViewById(R.id.imageViewTurkey_2);
        progressBarTurkey_2 = view.findViewById(R.id.progressBarTurkey_2);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-turkey_1401-245.jpg")
                .into(imageViewTurkey_2, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarTurkey_2.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarTurkey_2.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}