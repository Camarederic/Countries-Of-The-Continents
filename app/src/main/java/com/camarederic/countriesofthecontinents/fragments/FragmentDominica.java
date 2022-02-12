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


public class FragmentDominica extends Fragment {

    public static FragmentDominica newInstance(){
        return new FragmentDominica();
    }

    private ImageView imageViewDominica;
    private ProgressBar progressBarDominica;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dominica, container, false);

        imageViewDominica = view.findViewById(R.id.imageViewDominica);
        progressBarDominica = view.findViewById(R.id.progressBarDominica);

        Picasso.get().load("https://media.istockphoto.com/photos/wavy-flag-of-dominica-picture-id179011670?b" +
                "=1&k=20&m=179011670&s=170667a&w=0&h=W3ODa8Km5XrwCT0UUlkO7j3CIgw-_1BWYp8i0dXYiMQ=")
                .into(imageViewDominica, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarDominica.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarDominica.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}