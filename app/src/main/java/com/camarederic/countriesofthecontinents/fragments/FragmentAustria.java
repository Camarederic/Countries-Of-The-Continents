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


public class FragmentAustria extends Fragment {

    public static FragmentAustria newInstance(){
        return new FragmentAustria();
    }

    private ImageView imageViewAustria;
    private ProgressBar progressBarAustria;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_austria, container, false);

        imageViewAustria = view.findViewById(R.id.imageViewAustria);
        progressBarAustria = view.findViewById(R.id.progressBarAustria);

        Picasso.get().load("https://image.freepik.com/fotos-gratis/bandeira-da-austria_1401-60.jpg")
                .into(imageViewAustria, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarAustria.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarAustria.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}