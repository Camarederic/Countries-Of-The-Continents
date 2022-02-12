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


public class FragmentBotswana extends Fragment {

    public static FragmentBotswana newInstance(){
        return new FragmentBotswana();
    }

    private ImageView imageViewBotswana;
    private ProgressBar progressBarBotswana;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_botswana, container, false);

        imageViewBotswana = view.findViewById(R.id.imageViewBotswana);
        progressBarBotswana = view.findViewById(R.id.progressBarBotswana);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-botswana_1401-75.jpg")
                .into(imageViewBotswana, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarBotswana.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBotswana.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}