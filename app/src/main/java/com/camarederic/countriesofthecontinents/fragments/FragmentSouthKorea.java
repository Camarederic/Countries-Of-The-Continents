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


public class FragmentSouthKorea extends Fragment {


    public static FragmentSouthKorea newInstance() {
        return new FragmentSouthKorea();
    }

    private ImageView imageViewSouthKorea;
    private ProgressBar progressBarSouthKorea;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_south_korea, container, false);

        imageViewSouthKorea = view.findViewById(R.id.imageViewSouthKorea);
        progressBarSouthKorea = view.findViewById(R.id.progressBarSouthKorea);

        Picasso.get().load("https://media.istockphoto.com/photos/waving-world-flags-silk-satin-texture-3d-illustration" +
                "-picture-id1209256326?k=20&m=1209256326&s=612x612&w=0&h=gFFfDvenqs9_cv0DUHAEG7heY78l6HyUD4zGUB-M3Gw=")
                .into(imageViewSouthKorea, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarSouthKorea.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSouthKorea.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}