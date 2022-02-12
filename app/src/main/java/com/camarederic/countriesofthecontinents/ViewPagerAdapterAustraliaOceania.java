package com.camarederic.countriesofthecontinents;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.camarederic.countriesofthecontinents.fragments.FragmentAustralia;
import com.camarederic.countriesofthecontinents.fragments.FragmentFiji;
import com.camarederic.countriesofthecontinents.fragments.FragmentKiribati;
import com.camarederic.countriesofthecontinents.fragments.FragmentMarshallIslands;
import com.camarederic.countriesofthecontinents.fragments.FragmentMicronesia;
import com.camarederic.countriesofthecontinents.fragments.FragmentNauru;
import com.camarederic.countriesofthecontinents.fragments.FragmentNewZealand;
import com.camarederic.countriesofthecontinents.fragments.FragmentPalau;
import com.camarederic.countriesofthecontinents.fragments.FragmentPapuaNewGuinea;
import com.camarederic.countriesofthecontinents.fragments.FragmentSamoa;
import com.camarederic.countriesofthecontinents.fragments.FragmentSolomonIslands;
import com.camarederic.countriesofthecontinents.fragments.FragmentTonga;
import com.camarederic.countriesofthecontinents.fragments.FragmentTuvalu;
import com.camarederic.countriesofthecontinents.fragments.FragmentVanuatu;

public class ViewPagerAdapterAustraliaOceania extends FragmentStateAdapter {

    public ViewPagerAdapterAustraliaOceania(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;
        switch (position){
            case 0:
                fragment = FragmentAustralia.newInstance();
                break;
            case 1:
                fragment = FragmentFiji.newInstance();
                break;
            case 2:
                fragment = FragmentKiribati.newInstance();
                break;
            case 3:
                fragment = FragmentMarshallIslands.newInstance();
                break;
            case 4:
                fragment = FragmentMicronesia.newInstance();
                break;
            case 5:
                fragment = FragmentNauru.newInstance();
                break;
            case 6:
                fragment = FragmentNewZealand.newInstance();
                break;
            case 7:
                fragment = FragmentPalau.newInstance();
                break;
            case 8:
                fragment = FragmentPapuaNewGuinea.newInstance();
                break;
            case 9:
                fragment = FragmentSamoa.newInstance();
                break;
            case 10:
                fragment = FragmentSolomonIslands.newInstance();
                break;
            case 11:
                fragment = FragmentTonga.newInstance();
                break;
            case 12:
                fragment = FragmentTuvalu.newInstance();
                break;
            case 13:
                fragment = FragmentVanuatu.newInstance();
                break;


            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 14;
    }
}
