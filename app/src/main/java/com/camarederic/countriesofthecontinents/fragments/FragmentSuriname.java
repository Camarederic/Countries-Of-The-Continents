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


public class FragmentSuriname extends Fragment {

    public static FragmentSuriname newInstance() {
        return new FragmentSuriname();
    }

    private ImageView imageViewSuriname;
    private ProgressBar progressBarSuriname;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_suriname, container, false);

        imageViewSuriname = view.findViewById(R.id.imageViewSuriname);
        progressBarSuriname = view.findViewById(R.id.progressBarSuriname);

        Picasso.get().load("https://s8.travelask.ru/system/images/files/000/007/714/wysiwyg_jpg/" +
                "%D1%81%D1%83%D1%80%D0%B8%D0%BD%D0%B0%D0%BC_%D1%84%D0%BB%D0%B0%D0%B3.jpg?1486365174")
                .into(imageViewSuriname, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSuriname.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSuriname.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}