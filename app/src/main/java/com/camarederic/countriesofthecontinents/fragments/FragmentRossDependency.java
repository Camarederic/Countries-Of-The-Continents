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


public class FragmentRossDependency extends Fragment {


    public static FragmentRossDependency newInstance(){
        return new FragmentRossDependency();
    }

    private ImageView imageViewRossDependency;
    private ProgressBar progressBarRossDependency;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ross_dependency,container,false);

        imageViewRossDependency = view.findViewById(R.id.imageViewRossDependency);
        progressBarRossDependency = view.findViewById(R.id.progressBarRossDependency);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/Flag_of_the_Australian_Antarctic_Territory_" +
                "%28unofficial%29.svg/2560px-Flag_of_the_Australian_Antarctic_Territory_%28unofficial%29.svg.png")
                .into(imageViewRossDependency, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarRossDependency.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarRossDependency.setVisibility(View.INVISIBLE);

                    }
                });
        return view;
    }
}