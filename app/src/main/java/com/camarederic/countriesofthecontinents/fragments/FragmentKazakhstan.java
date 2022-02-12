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


public class FragmentKazakhstan extends Fragment {


    public static FragmentKazakhstan newInstance() {
        return new FragmentKazakhstan();
    }

    private ImageView imageViewKazakhstan;
    private ProgressBar progressBarKazakhstan;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_kazakhstan, container, false);

        imageViewKazakhstan = view.findViewById(R.id.imageViewKazakhstan);
        progressBarKazakhstan = view.findViewById(R.id.progressBarKazakhstan);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-kazakhstan_1401-144.jpg")
                .into(imageViewKazakhstan, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarKazakhstan.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarKazakhstan.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}