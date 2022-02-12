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


public class FragmentEastTimor extends Fragment {

    public static FragmentEastTimor newInstance(){
        return new FragmentEastTimor();
    }


    private ImageView imageViewEastTimor;
    private ProgressBar progressBarEastTimor;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_east_timor, container, false);

        imageViewEastTimor = view.findViewById(R.id.imageViewEastTimor);
        progressBarEastTimor = view.findViewById(R.id.progressBarEastTimor);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-east-timor_1401-103.jpg")
                .into(imageViewEastTimor, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarEastTimor.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarEastTimor.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}