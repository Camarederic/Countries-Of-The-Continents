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


public class FragmentElSalvador extends Fragment {

    public static FragmentElSalvador newInstance(){
        return new FragmentElSalvador();
    }

    private ImageView imageViewElSalvador;
    private ProgressBar progressBarElSalvador;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_el_salvador, container, false);

        imageViewElSalvador = view.findViewById(R.id.imageViewElSalvador);
        progressBarElSalvador = view.findViewById(R.id.progressBarElSalvador);

        Picasso.get().load("https://img.freepik.com/free-photo/" +
                "flag-of-el-salvador_1401-106.jpg?size=626&ext=jpg&ga=GA1.2.1566013330.1638230400")
                .into(imageViewElSalvador, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarElSalvador.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarElSalvador.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}