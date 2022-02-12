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


public class FragmentComoros extends Fragment {

    public static FragmentComoros newInstance(){
        return new FragmentComoros();
    }

    private ImageView imageViewComoros;
    private ProgressBar progressBarComoros;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_comoros, container, false);

        imageViewComoros = view.findViewById(R.id.imageViewComoros);
        progressBarComoros = view.findViewById(R.id.progressBarComoros);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-comoros_1401-91.jpg")
                .into(imageViewComoros, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarComoros.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarComoros.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}