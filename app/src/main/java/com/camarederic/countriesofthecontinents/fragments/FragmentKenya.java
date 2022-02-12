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


public class FragmentKenya extends Fragment {

    public static FragmentKenya newInstance() {
        return new FragmentKenya();
    }

    private ImageView imageViewKenya;
    private ProgressBar progressBarKenya;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_kenya, container, false);

        imageViewKenya = view.findViewById(R.id.imageViewKenya);
        progressBarKenya = view.findViewById(R.id.progressBarKenya);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-kenya_1401-145.jpg")
                .into(imageViewKenya, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarKenya.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarKenya.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}