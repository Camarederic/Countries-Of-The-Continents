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


public class FragmentIran extends Fragment {

    public static FragmentIran newInstance() {
        return new FragmentIran();
    }

    private ImageView imageViewIran;
    private ProgressBar progressBarIran;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_iran, container, false);

        imageViewIran = view.findViewById(R.id.imageViewIran);
        progressBarIran = view.findViewById(R.id.progressBarIran);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-iran_1401-134.jpg")
                .into(imageViewIran, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarIran.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarIran.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}