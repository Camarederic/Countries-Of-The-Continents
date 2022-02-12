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


public class FragmentPapuaNewGuinea extends Fragment {


    public static FragmentPapuaNewGuinea newInstance() {
        return new FragmentPapuaNewGuinea();
    }

    private ImageView imageViewPapuaNewGuinea;
    private ProgressBar progressBarPapuaNewGuinea;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_papua_new_guinea, container, false);

        imageViewPapuaNewGuinea = view.findViewById(R.id.imageViewPapuaNewGuinea);
        progressBarPapuaNewGuinea = view.findViewById(R.id.progressBarPapuaNewGuinea);

        Picasso.get().load("https://image.freepik.com/free-photo/flag-of-papua-new-guinea_1401-196.jpg")
                .into(imageViewPapuaNewGuinea, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarPapuaNewGuinea.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarPapuaNewGuinea.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}