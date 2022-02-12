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


public class FragmentMyanmar extends Fragment {


    public static FragmentMyanmar newInstance() {
        return new FragmentMyanmar();
    }

    private ImageView imageViewMyanmar;
    private ProgressBar progressBarMyanmar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_myanmar, container, false);

        imageViewMyanmar = view.findViewById(R.id.imageViewMyanmar);
        progressBarMyanmar = view.findViewById(R.id.progressBarMyanmar);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-myanmar_1401-179.jpg")
                .into(imageViewMyanmar, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarMyanmar.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMyanmar.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}