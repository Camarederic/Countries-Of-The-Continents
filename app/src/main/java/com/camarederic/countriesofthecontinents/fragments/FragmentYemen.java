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


public class FragmentYemen extends Fragment {

    public static FragmentYemen newInstance() {
        return new FragmentYemen();
    }

    private ImageView imageViewYemen;
    private ProgressBar progressBarYemen;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_yemen, container, false);

        imageViewYemen = view.findViewById(R.id.imageViewYemen);
        progressBarYemen = view.findViewById(R.id.progressBarYemen);

        Picasso.get().load("https://media.istockphoto.com/photos/yemen-flag-picture-id1181027664?k=20&m=" +
                "1181027664&s=612x612&w=0&h=Q60qOZ4lbWedldwl1I6yyJvcWpAw9YacNAAlUhkpvpA=")
                .into(imageViewYemen, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarYemen.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarYemen.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}