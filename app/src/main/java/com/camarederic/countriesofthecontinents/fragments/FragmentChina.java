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


public class FragmentChina extends Fragment {

    public static FragmentChina newInstance(){
        return new FragmentChina();
    }

    private ImageView imageViewChina;
    private ProgressBar progressBarChina;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_china, container, false);

        imageViewChina = view.findViewById(R.id.imageViewChina);
        progressBarChina = view.findViewById(R.id.progressBarChina);

        Picasso.get().load("https://bitnovosti.com/wp-content/uploads/2020/07/1401-891.jpg")
                .into(imageViewChina, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarChina.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarChina.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}