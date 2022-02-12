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


public class FragmentLesotho extends Fragment {

    public static FragmentLesotho newInstance() {
        return new FragmentLesotho();
    }

    private ImageView imageViewLesotho;
    private ProgressBar progressBarLesotho;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lesotho, container, false);

        imageViewLesotho = view.findViewById(R.id.imageViewLesotho);
        progressBarLesotho = view.findViewById(R.id.progressBarLesotho);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-lesotho_1401-154.jpg")
                .into(imageViewLesotho, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarLesotho.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarLesotho.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}