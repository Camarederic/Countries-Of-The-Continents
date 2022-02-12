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


public class FragmentPeterIIsland extends Fragment {


    public static FragmentPeterIIsland newInstance(){
        return new FragmentPeterIIsland();
    }

    private ImageView imageViewPeterIIsland;
    private ProgressBar progressBarPeterIIsland;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_peter_i_island,container,false);

        imageViewPeterIIsland = view.findViewById(R.id.imageViewPeterIIsland);
        progressBarPeterIIsland = view.findViewById(R.id.progressBarPeterIIsland);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-norway_1401-189.jpg")
                .into(imageViewPeterIIsland, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarPeterIIsland.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarPeterIIsland.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}