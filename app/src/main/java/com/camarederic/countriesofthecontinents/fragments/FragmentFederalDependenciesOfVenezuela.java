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


public class FragmentFederalDependenciesOfVenezuela extends Fragment {

    public static FragmentFederalDependenciesOfVenezuela newInstance(){
        return new FragmentFederalDependenciesOfVenezuela();
    }

    private ImageView imageViewFederalDependenciesOfVenezuela;
    private ProgressBar progressBarFederalDependenciesOfVenezuela;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_federal_dependencies_of_venezuela, container, false);

        imageViewFederalDependenciesOfVenezuela = view.findViewById(R.id.imageViewFederalDependenciesOfVenezuela);
        progressBarFederalDependenciesOfVenezuela = view.findViewById(R.id.progressBarFederalDependenciesOfVenezuela);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/" +
                "Federal_dependencies_of_Venezuela%27s_Flag.svg/800px-Federal_dependencies_of_Venezuela%27s_Flag.svg.png")
                .into(imageViewFederalDependenciesOfVenezuela, new Callback() {
                    @Override
                    public void onSuccess() {

                        progressBarFederalDependenciesOfVenezuela.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarFederalDependenciesOfVenezuela.setVisibility(View.INVISIBLE);

                    }
                });

        return view;
    }
}