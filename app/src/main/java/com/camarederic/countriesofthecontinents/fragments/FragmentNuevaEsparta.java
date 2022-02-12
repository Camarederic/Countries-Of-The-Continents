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


public class FragmentNuevaEsparta extends Fragment {

    public static FragmentNuevaEsparta newInstance() {
        return new FragmentNuevaEsparta();
    }

    private ImageView imageViewNuevaEsparta;
    private ProgressBar progressBarNuevaEsparta;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_nueva_esparta, container, false);

        imageViewNuevaEsparta = view.findViewById(R.id.imageViewNuevaEsparta);
        progressBarNuevaEsparta = view.findViewById(R.id.progressBarNuevaEsparta);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/" +
                "thumb/6/6a/Flag_of_Nueva_Esparta.svg/1200px-Flag_of_Nueva_Esparta.svg.png")
                .into(imageViewNuevaEsparta, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarNuevaEsparta.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarNuevaEsparta.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}