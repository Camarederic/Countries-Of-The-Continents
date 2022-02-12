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


public class FragmentVietnam extends Fragment {


    public static FragmentVietnam newInstance() {
        return new FragmentVietnam();
    }

    private ImageView imageViewVietnam;
    private ProgressBar progressBarVietnam;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_vietnam, container, false);

        imageViewVietnam = view.findViewById(R.id.imageViewVietnam);
        progressBarVietnam = view.findViewById(R.id.progressBarVietnam);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-vietnam_1401-259.jpg")
                .into(imageViewVietnam, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarVietnam.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarVietnam.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}