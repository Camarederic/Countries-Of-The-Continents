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


public class FragmentRussia_2 extends Fragment {

    public static FragmentRussia_2 newInstance() {
        return new FragmentRussia_2();
    }

    private ImageView imageViewRussia_2;
    private ProgressBar progressBarRussia_2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_russia_2, container, false);

        imageViewRussia_2 = view.findViewById(R.id.imageViewRussia_2);
        progressBarRussia_2 = view.findViewById(R.id.progressBarRussia_2);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-russia_1401-206.jpg")
                .into(imageViewRussia_2, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarRussia_2.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarRussia_2.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}