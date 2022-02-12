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


public class FragmentCentralAfricanRepublic extends Fragment {

    public static FragmentCentralAfricanRepublic newInstance(){
        return new FragmentCentralAfricanRepublic();
    }

    private ImageView imageViewCentralAfricanRepublic;
    private ProgressBar progressBarCentralAfricanRepublic;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_central_african_republic, container, false);

        imageViewCentralAfricanRepublic = view.findViewById(R.id.imageViewCentralAfricanRepublic);
        progressBarCentralAfricanRepublic = view.findViewById(R.id.progressBarCentralAfricanRepublic);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-central-african-republic_1401-86.jpg")
                .into(imageViewCentralAfricanRepublic, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarCentralAfricanRepublic.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarCentralAfricanRepublic.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}