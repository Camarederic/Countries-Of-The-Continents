package com.camarederic.countriesofthecontinents;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.camarederic.countriesofthecontinents.fragments.FragmentAlbania;
import com.camarederic.countriesofthecontinents.fragments.FragmentAndorra;
import com.camarederic.countriesofthecontinents.fragments.FragmentArmenia;
import com.camarederic.countriesofthecontinents.fragments.FragmentAustria;
import com.camarederic.countriesofthecontinents.fragments.FragmentAzerbaijan;
import com.camarederic.countriesofthecontinents.fragments.FragmentBelarus;
import com.camarederic.countriesofthecontinents.fragments.FragmentBelgium;
import com.camarederic.countriesofthecontinents.fragments.FragmentBosniaAndHerzegovina;
import com.camarederic.countriesofthecontinents.fragments.FragmentBulgaria;
import com.camarederic.countriesofthecontinents.fragments.FragmentCroatia;
import com.camarederic.countriesofthecontinents.fragments.FragmentCyprus;
import com.camarederic.countriesofthecontinents.fragments.FragmentCzechia;
import com.camarederic.countriesofthecontinents.fragments.FragmentDenmark;
import com.camarederic.countriesofthecontinents.fragments.FragmentEstonia;
import com.camarederic.countriesofthecontinents.fragments.FragmentEurope;
import com.camarederic.countriesofthecontinents.fragments.FragmentFinland;
import com.camarederic.countriesofthecontinents.fragments.FragmentFrance;
import com.camarederic.countriesofthecontinents.fragments.FragmentGeorgia;
import com.camarederic.countriesofthecontinents.fragments.FragmentGermany;
import com.camarederic.countriesofthecontinents.fragments.FragmentGreece;
import com.camarederic.countriesofthecontinents.fragments.FragmentHungary;
import com.camarederic.countriesofthecontinents.fragments.FragmentIceland;
import com.camarederic.countriesofthecontinents.fragments.FragmentIreland;
import com.camarederic.countriesofthecontinents.fragments.FragmentItaly;
import com.camarederic.countriesofthecontinents.fragments.FragmentLatvia;
import com.camarederic.countriesofthecontinents.fragments.FragmentLiechtenstein;
import com.camarederic.countriesofthecontinents.fragments.FragmentLithuania;
import com.camarederic.countriesofthecontinents.fragments.FragmentLuxembourg;
import com.camarederic.countriesofthecontinents.fragments.FragmentMalta;
import com.camarederic.countriesofthecontinents.fragments.FragmentMoldova;
import com.camarederic.countriesofthecontinents.fragments.FragmentMonaco;
import com.camarederic.countriesofthecontinents.fragments.FragmentMontenegro;
import com.camarederic.countriesofthecontinents.fragments.FragmentNetherlands;
import com.camarederic.countriesofthecontinents.fragments.FragmentNorthMacedonia;
import com.camarederic.countriesofthecontinents.fragments.FragmentNorway;
import com.camarederic.countriesofthecontinents.fragments.FragmentPoland;
import com.camarederic.countriesofthecontinents.fragments.FragmentPortugal;
import com.camarederic.countriesofthecontinents.fragments.FragmentRomania;
import com.camarederic.countriesofthecontinents.fragments.FragmentRussia;
import com.camarederic.countriesofthecontinents.fragments.FragmentSanMarino;
import com.camarederic.countriesofthecontinents.fragments.FragmentSerbia;
import com.camarederic.countriesofthecontinents.fragments.FragmentSlovakia;
import com.camarederic.countriesofthecontinents.fragments.FragmentSlovenia;
import com.camarederic.countriesofthecontinents.fragments.FragmentSpain;
import com.camarederic.countriesofthecontinents.fragments.FragmentSweden;
import com.camarederic.countriesofthecontinents.fragments.FragmentSwitzerland;
import com.camarederic.countriesofthecontinents.fragments.FragmentTurkey;
import com.camarederic.countriesofthecontinents.fragments.FragmentUkraine;
import com.camarederic.countriesofthecontinents.fragments.FragmentUnitedKingdom;
import com.camarederic.countriesofthecontinents.fragments.FragmentVaticanCity;

public class ViewPagerAdapterEurope extends FragmentStateAdapter {

    public ViewPagerAdapterEurope(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;

        switch (position){
            case 0:
                fragment = FragmentEurope.newInstance();
                break;
            case 1:
                fragment = FragmentAlbania.newInstance();
                break;
            case 2:
                fragment = FragmentAndorra.newInstance();
                break;
            case 3:
                fragment = FragmentArmenia.newInstance();
                break;
            case 4:
                fragment = FragmentAustria.newInstance();
                break;
            case 5:
                fragment = FragmentAzerbaijan.newInstance();
                break;
            case 6:
                fragment = FragmentBelarus.newInstance();
                break;
            case 7:
                fragment = FragmentBelgium.newInstance();
                break;
            case 8:
                fragment = FragmentBosniaAndHerzegovina.newInstance();
                break;
            case 9:
                fragment = FragmentBulgaria.newInstance();
                break;
            case 10:
                fragment = FragmentCroatia.newInstance();
                break;
            case 11:
                fragment = FragmentCyprus.newInstance();
                break;
            case 12:
                fragment = FragmentCzechia.newInstance();
                break;
            case 13:
                fragment = FragmentDenmark.newInstance();
                break;
            case 14:
                fragment = FragmentEstonia.newInstance();
                break;
            case 15:
                fragment = FragmentFinland.newInstance();
                break;
            case 16:
                fragment = FragmentFrance.newInstance();
                break;
            case 17:
                fragment = FragmentGeorgia.newInstance();
                break;
            case 18:
                fragment = FragmentGermany.newInstance();
                break;
            case 19:
                fragment = FragmentGreece.newInstance();
                break;
            case 20:
                fragment = FragmentHungary.newInstance();
                break;
            case 21:
                fragment = FragmentIceland.newInstance();
                break;
            case 22:
                fragment = FragmentIreland.newInstance();
                break;
            case 23:
                fragment = FragmentItaly.newInstance();
                break;
            case 24:
                fragment = FragmentLatvia.newInstance();
                break;
            case 25:
                fragment = FragmentLiechtenstein.newInstance();
                break;
            case 26:
                fragment = FragmentLithuania.newInstance();
                break;
            case 27:
                fragment = FragmentLuxembourg.newInstance();
                break;
            case 28:
                fragment = FragmentMalta.newInstance();
                break;
            case 29:
                fragment = FragmentMoldova.newInstance();
                break;
            case 30:
                fragment = FragmentMonaco.newInstance();
                break;
            case 31:
                fragment = FragmentMontenegro.newInstance();
                break;
            case 32:
                fragment = FragmentNetherlands.newInstance();
                break;
            case 33:
                fragment = FragmentNorthMacedonia.newInstance();
                break;
            case 34:
                fragment = FragmentNorway.newInstance();
                break;
            case 35:
                fragment = FragmentPoland.newInstance();
                break;
            case 36:
                fragment = FragmentPortugal.newInstance();
                break;
            case 37:
                fragment = FragmentRomania.newInstance();
                break;
            case 38:
                fragment = FragmentRussia.newInstance();
                break;
            case 39:
                fragment = FragmentSanMarino.newInstance();
                break;
            case 40:
                fragment = FragmentSerbia.newInstance();
                break;
            case 41:
                fragment = FragmentSlovakia.newInstance();
                break;
            case 42:
                fragment = FragmentSlovenia.newInstance();
                break;
            case 43:
                fragment = FragmentSpain.newInstance();
                break;
            case 44:
                fragment = FragmentSweden.newInstance();
                break;
            case 45:
                fragment = FragmentSwitzerland.newInstance();
                break;
            case 46:
                fragment = FragmentTurkey.newInstance();
                break;
            case 47:
                fragment = FragmentUkraine.newInstance();
                break;
            case 48:
                fragment = FragmentUnitedKingdom.newInstance();
                break;
            case 49:
                fragment = FragmentVaticanCity.newInstance();
                break;

            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 50;
    }
}
