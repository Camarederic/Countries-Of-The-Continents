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


public class FragmentSomaliland extends Fragment {

    public static FragmentSomaliland newInstance() {
        return new FragmentSomaliland();
    }

    private ImageView imageViewSomaliland;
    private ProgressBar progressBarSomaliland;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_somaliland, container, false);

        imageViewSomaliland = view.findViewById(R.id.imageViewSomaliland);
        progressBarSomaliland = view.findViewById(R.id.progressBarSomaliland);

        Picasso.get().load("https://img.freepik.com/free-photo/waving-national-flag-of-" +
                "somaliland-waved-highly-detailed-close-up-3d-render_484154-658.jpg?size=626&ext=jpg")
                .into(imageViewSomaliland, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSomaliland.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSomaliland.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}