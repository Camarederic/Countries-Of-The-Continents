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


public class FragmentCuracao extends Fragment {

    public static FragmentCuracao newInstance(){
        return new FragmentCuracao();
    }

    private ImageView imageViewCuracao;
    private ProgressBar progressBarCuracao;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_curacao, container, false);

        imageViewCuracao = view.findViewById(R.id.imageViewCuracao);
        progressBarCuracao = view.findViewById(R.id.progressBarCuracao);

        Picasso.get().load("https://t3.ftcdn.net/jpg/02/68/59/48/360_F_268594837_rT1lnhdHyRQzEdAJKm43hQy4nPGBMPJ3.jpg")
                .into(imageViewCuracao, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarCuracao.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarCuracao.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}