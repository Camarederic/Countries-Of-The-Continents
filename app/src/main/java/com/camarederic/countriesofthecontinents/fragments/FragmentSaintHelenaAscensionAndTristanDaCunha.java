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


public class FragmentSaintHelenaAscensionAndTristanDaCunha extends Fragment {

    public static FragmentSaintHelenaAscensionAndTristanDaCunha newInstance() {
        return new FragmentSaintHelenaAscensionAndTristanDaCunha();
    }

    private ImageView imageViewSaintHelenaAscensionAndTristanDaCunha;
    private ProgressBar progressBarSaintHelenaAscensionAndTristanDaCunha;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_saint_helena_ascension_and_tristan_da_cunha, container, false);

        imageViewSaintHelenaAscensionAndTristanDaCunha = view.findViewById(R.id.imageViewSaintHelenaAscensionAndTristanDaCunha);
        progressBarSaintHelenaAscensionAndTristanDaCunha = view.findViewById(R.id.progressBarSaintHelenaAscensionAndTristanDaCunha);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-the-united-kingdom_1401-252.jpg")
                .into(imageViewSaintHelenaAscensionAndTristanDaCunha, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarSaintHelenaAscensionAndTristanDaCunha.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSaintHelenaAscensionAndTristanDaCunha.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}