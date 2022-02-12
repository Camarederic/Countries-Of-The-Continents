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


public class FragmentIndonesia extends Fragment {

    public static FragmentIndonesia newInstance(){
        return new FragmentIndonesia();
    }


    private ImageView imageViewIndonesia;
    private ProgressBar progressBarIndonesia;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_indonesia, container, false);

        imageViewIndonesia = view.findViewById(R.id.imageViewIndonesia);
        progressBarIndonesia = view.findViewById(R.id.progressBarIndonesia);

        Picasso.get().load("https://storage.googleapis.com/kaggle-datasets-images/" +
                "328281/725250/7cc2b6046341f68ff4ac3479974ec146/data-original.jpg?t=2020-01-29-06-53-40")
                .into(imageViewIndonesia, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarIndonesia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarIndonesia.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}