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


public class FragmentBrazil extends Fragment {

    public static FragmentBrazil newInstance(){
        return new FragmentBrazil();
    }

    private ImageView imageViewBrazil;
    private ProgressBar progressBarBrazil;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_brazil, container, false);

        imageViewBrazil = view.findViewById(R.id.imageViewBrazil);
        progressBarBrazil = view.findViewById(R.id.progressBarBrazil);

        Picasso.get().load("https://militaryarms.ru/wp-content/uploads/2021/08/76-scaled.jpg")
                .into(imageViewBrazil, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarBrazil.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBrazil.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}