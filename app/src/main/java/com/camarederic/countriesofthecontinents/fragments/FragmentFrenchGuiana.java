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


public class FragmentFrenchGuiana extends Fragment {

    public static FragmentFrenchGuiana newInstance(){
        return new FragmentFrenchGuiana();
    }

    private ImageView imageViewFrenchGuiana;
    private ProgressBar progressBarFrenchGuiana;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_french_guiana, container, false);

        imageViewFrenchGuiana = view.findViewById(R.id.imageViewFrenchGuiana);
        progressBarFrenchGuiana = view.findViewById(R.id.progressBarFrenchGuiana);

        Picasso.get().load("https://media.istockphoto.com/photos/french-guiana-flag-overseas-territories-of-" +
                "france-picture-id1218597620?k=20&m=1218597620&s=612x612&w=0&h=7yxbk2GYGzTBeUkqLn554q0nFW8rPOFoijfM_UG0904=")
                .into(imageViewFrenchGuiana, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarFrenchGuiana.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarFrenchGuiana.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}