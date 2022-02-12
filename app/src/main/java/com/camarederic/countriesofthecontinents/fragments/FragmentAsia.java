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


public class FragmentAsia extends Fragment {

    public static FragmentAsia newInstance(){
        return new FragmentAsia();
    }

    private ImageView imageViewAsia;
    private ProgressBar progressBarAsia;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_asia,container,false);

        imageViewAsia = view.findViewById(R.id.imageViewAsia);
        progressBarAsia = view.findViewById(R.id.progressBarAsia);

        Picasso.get().load("https://d3jlfsfsyc6yvi.cloudfront.net/image/mw:1024/q:85/https%3A%2F%2Fhaygot." +
                "s3.amazonaws.com%3A443%2Fcheatsheet%2F29793_f3cc1aca98414aeebdc26d957538f3fc.png")
                .into(imageViewAsia, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarAsia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarAsia.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}