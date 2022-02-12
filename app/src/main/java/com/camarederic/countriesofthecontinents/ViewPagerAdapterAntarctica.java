package com.camarederic.countriesofthecontinents;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.camarederic.countriesofthecontinents.fragments.FragmentAdelieLand;
import com.camarederic.countriesofthecontinents.fragments.FragmentAntarctica;
import com.camarederic.countriesofthecontinents.fragments.FragmentArgentineAntarctica;
import com.camarederic.countriesofthecontinents.fragments.FragmentAustralianAntarcticTerritory;
import com.camarederic.countriesofthecontinents.fragments.FragmentBritishAntarcticTerritory;
import com.camarederic.countriesofthecontinents.fragments.FragmentChileanAntarcticTerritory;
import com.camarederic.countriesofthecontinents.fragments.FragmentPeterIIsland;
import com.camarederic.countriesofthecontinents.fragments.FragmentQueenMaudLand;
import com.camarederic.countriesofthecontinents.fragments.FragmentRossDependency;

public class ViewPagerAdapterAntarctica extends FragmentStateAdapter {


    public ViewPagerAdapterAntarctica(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;
        switch (position){
            case 0:
                fragment = FragmentAntarctica.newInstance();
                break;
            case 1:
                fragment = FragmentAdelieLand.newInstance();
                break;
            case 2:
                fragment = FragmentArgentineAntarctica.newInstance();
                break;
            case 3:
                fragment = FragmentAustralianAntarcticTerritory.newInstance();
                break;
            case 4:
                fragment = FragmentBritishAntarcticTerritory.newInstance();
                break;
            case 5:
                fragment = FragmentChileanAntarcticTerritory.newInstance();
                break;
            case 6:
                fragment = FragmentPeterIIsland.newInstance();
                break;
            case 7:
                fragment = FragmentQueenMaudLand.newInstance();
                break;
            case 8:
                fragment = FragmentRossDependency.newInstance();
                break;

            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 9;
    }
}
