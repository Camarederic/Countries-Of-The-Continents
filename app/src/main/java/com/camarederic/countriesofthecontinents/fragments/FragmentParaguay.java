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


public class FragmentParaguay extends Fragment {

    public static FragmentParaguay newInstance() {
        return new FragmentParaguay();
    }

    private ImageView imageViewParaguay;
    private ProgressBar progressBarParaguay;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_paraguay, container, false);

        imageViewParaguay = view.findViewById(R.id.imageViewParaguay);
        progressBarParaguay = view.findViewById(R.id.progressBarParaguay);

        Picasso.get().load("https://www.visaisrael.org.il/wp-content/uploads/2020/09/flag-paraguay_1401-197.jpg")
                .into(imageViewParaguay, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarParaguay.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarParaguay.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}