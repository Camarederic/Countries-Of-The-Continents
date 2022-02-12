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


public class FragmentFiji extends Fragment {

    public static FragmentFiji newInstance(){
        return new FragmentFiji();
    }

    private ImageView imageViewFiji;
    private ProgressBar progressBarFiji;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fiji,container,false);

        imageViewFiji = view.findViewById(R.id.imageViewFiji);
        progressBarFiji = view.findViewById(R.id.progressBarFiji);

        Picasso.get().load("https://img.freepik.com/free-photo/flag-fiji_1401-112.jpg?size=626&ext=jpg")
                .into(imageViewFiji, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarFiji.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarFiji.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}