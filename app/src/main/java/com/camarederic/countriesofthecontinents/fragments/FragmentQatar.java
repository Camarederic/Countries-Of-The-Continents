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


public class FragmentQatar extends Fragment {


    public static FragmentQatar newInstance() {
        return new FragmentQatar();
    }

    private ImageView imageViewQatar;
    private ProgressBar progressBarQatar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_qatar, container, false);

        imageViewQatar = view.findViewById(R.id.imageViewQatar);
        progressBarQatar = view.findViewById(R.id.progressBarQatar);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-qatar_1401-203.jpg")
                .into(imageViewQatar, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarQatar.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarQatar.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}