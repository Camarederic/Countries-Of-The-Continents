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


public class FragmentUruguay extends Fragment {

    public static FragmentUruguay newInstance() {
        return new FragmentUruguay();
    }

    private ImageView imageViewUruguay;
    private ProgressBar progressBarUruguay;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_uruguay, container, false);

        imageViewUruguay = view.findViewById(R.id.imageViewUruguay);
        progressBarUruguay = view.findViewById(R.id.progressBarUruguay);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-uruguay_1401-254.jpg")
                .into(imageViewUruguay, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarUruguay.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarUruguay.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}