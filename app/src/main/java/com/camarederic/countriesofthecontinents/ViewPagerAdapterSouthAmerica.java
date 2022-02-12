package com.camarederic.countriesofthecontinents;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.camarederic.countriesofthecontinents.fragments.FragmentArgentina;
import com.camarederic.countriesofthecontinents.fragments.FragmentBolivia;
import com.camarederic.countriesofthecontinents.fragments.FragmentBouvetIsland;
import com.camarederic.countriesofthecontinents.fragments.FragmentBrazil;
import com.camarederic.countriesofthecontinents.fragments.FragmentChile;
import com.camarederic.countriesofthecontinents.fragments.FragmentColombia;
import com.camarederic.countriesofthecontinents.fragments.FragmentEcuador;
import com.camarederic.countriesofthecontinents.fragments.FragmentFalklandIslands;
import com.camarederic.countriesofthecontinents.fragments.FragmentFrenchGuiana;
import com.camarederic.countriesofthecontinents.fragments.FragmentGuyana;
import com.camarederic.countriesofthecontinents.fragments.FragmentParaguay;
import com.camarederic.countriesofthecontinents.fragments.FragmentPeru;
import com.camarederic.countriesofthecontinents.fragments.FragmentSouthAmerica;
import com.camarederic.countriesofthecontinents.fragments.FragmentSouthGeorgiaAndTheSouthSandwichIslands;
import com.camarederic.countriesofthecontinents.fragments.FragmentSuriname;
import com.camarederic.countriesofthecontinents.fragments.FragmentUruguay;
import com.camarederic.countriesofthecontinents.fragments.FragmentVenezuela;

public class ViewPagerAdapterSouthAmerica extends FragmentStateAdapter {
    public ViewPagerAdapterSouthAmerica(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch (position){
            case 0:
                fragment = FragmentSouthAmerica.newInstance();
                break;
            case 1:
                fragment = FragmentArgentina.newInstance();
                break;
            case 2:
                fragment = FragmentBolivia.newInstance();
                break;
            case 3:
                fragment = FragmentBouvetIsland.newInstance();
                break;
            case 4:
                fragment = FragmentBrazil.newInstance();
                break;
            case 5:
                fragment = FragmentChile.newInstance();
                break;
            case 6:
                fragment = FragmentColombia.newInstance();
                break;
            case 7:
                fragment = FragmentEcuador.newInstance();
                break;
            case 8:
                fragment = FragmentFalklandIslands.newInstance();
                break;
            case 9:
                fragment = FragmentFrenchGuiana.newInstance();
                break;
            case 10:
                fragment = FragmentGuyana.newInstance();
                break;
            case 11:
                fragment = FragmentParaguay.newInstance();
                break;
            case 12:
                fragment = FragmentPeru.newInstance();
                break;
            case 13:
                fragment = FragmentSouthGeorgiaAndTheSouthSandwichIslands.newInstance();
                break;
            case 14:
                fragment = FragmentSuriname.newInstance();
                break;
            case 15:
                fragment = FragmentUruguay.newInstance();
                break;
            case 16:
                fragment = FragmentVenezuela.newInstance();
                break;

            default:
                return null;
        }


        return fragment;
    }

    @Override
    public int getItemCount() {
        return 17;
    }
}
