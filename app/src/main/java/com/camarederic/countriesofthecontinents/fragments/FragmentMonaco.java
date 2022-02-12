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


public class FragmentMonaco extends Fragment {

    public static FragmentMonaco newInstance() {
        return new FragmentMonaco();
    }

    private ImageView imageViewMonaco;
    private ProgressBar progressBarMonaco;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_monaco, container, false);

        imageViewMonaco = view.findViewById(R.id.imageViewMonaco);
        progressBarMonaco = view.findViewById(R.id.progressBarMonaco);

        Picasso.get().load("https://regnum.ru/uploads/pictures/news/2016/06/22/regnum_picture_1466586495402195_normal.jpg")
                .into(imageViewMonaco, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarMonaco.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMonaco.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}