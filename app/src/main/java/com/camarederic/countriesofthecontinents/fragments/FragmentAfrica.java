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


public class FragmentAfrica extends Fragment {

    public static FragmentAfrica newInstance(){
        return new FragmentAfrica();
    }

    private ImageView imageViewAfrica;
    private ProgressBar progressBarAfrica;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_africa,container,false);

        imageViewAfrica = view.findViewById(R.id.imageViewAfrica);
        progressBarAfrica = view.findViewById(R.id.progressBarAfrica);

        Picasso.get().load("https://d3jlfsfsyc6yvi.cloudfront.net/image/mw:1024/q:85/https%3A%2F%2Fhaygot.s3." +
                "amazonaws.com%3A443%2Fcheatsheet%2F29797_9fea1d6048434aaab08787e05271949a.png")
                .into(imageViewAfrica, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarAfrica.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarAfrica.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}