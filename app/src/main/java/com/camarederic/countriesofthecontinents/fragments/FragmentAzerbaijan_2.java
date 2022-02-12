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


public class FragmentAzerbaijan_2 extends Fragment {

    public static FragmentAzerbaijan_2 newInstance(){
        return new FragmentAzerbaijan_2();
    }

    private ImageView imageViewAzerbaijan_2;
    private ProgressBar progressBarazerbaijan_2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_azerbaijan_2, container, false);

        imageViewAzerbaijan_2 = view.findViewById(R.id.imageViewAzerbaijan_2);
        progressBarazerbaijan_2 = view.findViewById(R.id.progressBarAzerbaijan_2);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-azerbaijan_1401-62.jpg")
                .into(imageViewAzerbaijan_2, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarazerbaijan_2.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarazerbaijan_2.setVisibility(View.INVISIBLE);
                    }
                });
        return view;
    }
}