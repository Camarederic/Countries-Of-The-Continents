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


public class FragmentAntiguaAndBarbuda extends Fragment {

    public static FragmentAntiguaAndBarbuda newInstance(){
        return new FragmentAntiguaAndBarbuda();
    }

    private ImageView imageViewAntiguaAndBarbuda;
    private ProgressBar progressBarAntiguaAndBarbuda;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_antigua_and_barbuda, container, false);

        imageViewAntiguaAndBarbuda = view.findViewById(R.id.imageViewAntiguaAndBarbuda);
        progressBarAntiguaAndBarbuda = view.findViewById(R.id.progressBarAntiguaAndBarbuda);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-antigua-and-barbuda_1401-55.jpg")
                .into(imageViewAntiguaAndBarbuda, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarAntiguaAndBarbuda.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarAntiguaAndBarbuda.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}