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


public class FragmentKyrgyzstan extends Fragment {


    public static FragmentKyrgyzstan newInstance() {
        return new FragmentKyrgyzstan();
    }

    private ImageView imageViewKyrgyzstan;
    private ProgressBar progressBarKyrgyzstan;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_kyrgyzstan, container, false);

        imageViewKyrgyzstan = view.findViewById(R.id.imageViewKyrgyzstan);
        progressBarKyrgyzstan = view.findViewById(R.id.progressBarKyrgyzstan);

        Picasso.get().load("https://platforma.kg/wp-content/uploads/2020/12/9-1.jpg")
                .into(imageViewKyrgyzstan, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarKyrgyzstan.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarKyrgyzstan.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}