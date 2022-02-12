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


public class FragmentMadagascar extends Fragment {

    public static FragmentMadagascar newInstance() {
        return new FragmentMadagascar();
    }

    private ImageView imageViewMadagascar;
    private ProgressBar progressBarMadagascar;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_madagascar, container, false);

        imageViewMadagascar = view.findViewById(R.id.imageViewMadagascar);
        progressBarMadagascar = view.findViewById(R.id.progressBarMadagascar);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-madagascar_1401-162.jpg")
                .into(imageViewMadagascar, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarMadagascar.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMadagascar.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}