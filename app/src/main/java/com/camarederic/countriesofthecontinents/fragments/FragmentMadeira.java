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


public class FragmentMadeira extends Fragment {

    public static FragmentMadeira newInstance() {
        return new FragmentMadeira();
    }

    private ImageView imageViewMadeira;
    private ProgressBar progressBarMadeira;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_madeira, container, false);

        imageViewMadeira = view.findViewById(R.id.imageViewMadeira);
        progressBarMadeira = view.findViewById(R.id.progressBarMadeira);

        Picasso.get().load("https://images.pond5.com/madeira-island-portugal-flag-loop-footage-149469020_iconl.jpeg")
                .into(imageViewMadeira, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarMadeira.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMadeira.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}