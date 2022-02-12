package com.camarederic.countriesofthecontinents;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.camarederic.countriesofthecontinents.fragments.FragmentAfghanistan;
import com.camarederic.countriesofthecontinents.fragments.FragmentArmenia_2;
import com.camarederic.countriesofthecontinents.fragments.FragmentAsia;
import com.camarederic.countriesofthecontinents.fragments.FragmentAzerbaijan_2;
import com.camarederic.countriesofthecontinents.fragments.FragmentBahrain;
import com.camarederic.countriesofthecontinents.fragments.FragmentBangladesh;
import com.camarederic.countriesofthecontinents.fragments.FragmentBhutan;
import com.camarederic.countriesofthecontinents.fragments.FragmentBrunei;
import com.camarederic.countriesofthecontinents.fragments.FragmentCambodia;
import com.camarederic.countriesofthecontinents.fragments.FragmentChina;
import com.camarederic.countriesofthecontinents.fragments.FragmentCyprus_2;
import com.camarederic.countriesofthecontinents.fragments.FragmentEastTimor;
import com.camarederic.countriesofthecontinents.fragments.FragmentGeorgia_2;
import com.camarederic.countriesofthecontinents.fragments.FragmentIndia;
import com.camarederic.countriesofthecontinents.fragments.FragmentIndonesia;
import com.camarederic.countriesofthecontinents.fragments.FragmentIran;
import com.camarederic.countriesofthecontinents.fragments.FragmentIraq;
import com.camarederic.countriesofthecontinents.fragments.FragmentIsrael;
import com.camarederic.countriesofthecontinents.fragments.FragmentJapan;
import com.camarederic.countriesofthecontinents.fragments.FragmentJordan;
import com.camarederic.countriesofthecontinents.fragments.FragmentKazakhstan;
import com.camarederic.countriesofthecontinents.fragments.FragmentKuwait;
import com.camarederic.countriesofthecontinents.fragments.FragmentKyrgyzstan;
import com.camarederic.countriesofthecontinents.fragments.FragmentLaos;
import com.camarederic.countriesofthecontinents.fragments.FragmentLebanon;
import com.camarederic.countriesofthecontinents.fragments.FragmentMalaysia;
import com.camarederic.countriesofthecontinents.fragments.FragmentMaldives;
import com.camarederic.countriesofthecontinents.fragments.FragmentMongolia;
import com.camarederic.countriesofthecontinents.fragments.FragmentMyanmar;
import com.camarederic.countriesofthecontinents.fragments.FragmentNepal;
import com.camarederic.countriesofthecontinents.fragments.FragmentNorthKorea;
import com.camarederic.countriesofthecontinents.fragments.FragmentOman;
import com.camarederic.countriesofthecontinents.fragments.FragmentPakistan;
import com.camarederic.countriesofthecontinents.fragments.FragmentPalestine;
import com.camarederic.countriesofthecontinents.fragments.FragmentPhilippines;
import com.camarederic.countriesofthecontinents.fragments.FragmentQatar;
import com.camarederic.countriesofthecontinents.fragments.FragmentRussia_2;
import com.camarederic.countriesofthecontinents.fragments.FragmentSaudiArabia;
import com.camarederic.countriesofthecontinents.fragments.FragmentSingapore;
import com.camarederic.countriesofthecontinents.fragments.FragmentSouthKorea;
import com.camarederic.countriesofthecontinents.fragments.FragmentSriLanka;
import com.camarederic.countriesofthecontinents.fragments.FragmentSyria;
import com.camarederic.countriesofthecontinents.fragments.FragmentTaiwan;
import com.camarederic.countriesofthecontinents.fragments.FragmentTajikistan;
import com.camarederic.countriesofthecontinents.fragments.FragmentThailand;
import com.camarederic.countriesofthecontinents.fragments.FragmentTurkey_2;
import com.camarederic.countriesofthecontinents.fragments.FragmentTurkmenistan;
import com.camarederic.countriesofthecontinents.fragments.FragmentUnitedArabEmirates;
import com.camarederic.countriesofthecontinents.fragments.FragmentUzbekistan;
import com.camarederic.countriesofthecontinents.fragments.FragmentVietnam;
import com.camarederic.countriesofthecontinents.fragments.FragmentYemen;

public class ViewPagerAdapterAsia extends FragmentStateAdapter {
    public ViewPagerAdapterAsia(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;
        switch (position){
            case 0:
                fragment = FragmentAsia.newInstance();
                break;
            case 1:
                fragment = FragmentAfghanistan.newInstance();
                break;
            case 2:
                fragment = FragmentArmenia_2.newInstance();
                break;
            case 3:
                fragment = FragmentAzerbaijan_2.newInstance();
                break;
            case 4:
                fragment = FragmentBahrain.newInstance();
                break;
            case 5:
                fragment = FragmentBangladesh.newInstance();
                break;
            case 6:
                fragment = FragmentBhutan.newInstance();
                break;
            case 7:
                fragment = FragmentBrunei.newInstance();
                break;
            case 8:
                fragment = FragmentCambodia.newInstance();
                break;
            case 9:
                fragment = FragmentChina.newInstance();
                break;
            case 10:
                fragment = FragmentCyprus_2.newInstance();
                break;
            case 11:
                fragment = FragmentEastTimor.newInstance();
                break;
            case 12:
                fragment = FragmentGeorgia_2.newInstance();
                break;
            case 13:
                fragment = FragmentIndia.newInstance();
                break;
            case 14:
                fragment = FragmentIndonesia.newInstance();
                break;
            case 15:
                fragment = FragmentIran.newInstance();
                break;
            case 16:
                fragment = FragmentIraq.newIbstance();
                break;
            case 17:
                fragment = FragmentIsrael.newInstance();
                break;
            case 18:
                fragment = FragmentJapan.newInstance();
                break;
            case 19:
                fragment = FragmentJordan.newInstance();
                break;
            case 20:
                fragment = FragmentKazakhstan.newInstance();
                break;
            case 21:
                fragment = FragmentKuwait.newInstance();
                break;
            case 22:
                fragment = FragmentKyrgyzstan.newInstance();
                break;
            case 23:
                fragment = FragmentLaos.newInstance();
                break;
            case 24:
                fragment = FragmentLebanon.newInstance();
                break;
            case 25:
                fragment = FragmentMalaysia.newInstance();
                break;
            case 26:
                fragment = FragmentMaldives.newInstance();
                break;
            case 27:
                fragment = FragmentMongolia.newInstance();
                break;
            case 28:
                fragment = FragmentMyanmar.newInstance();
                break;
            case 29:
                fragment = FragmentNepal.newInstance();
                break;
            case 30:
                fragment = FragmentNorthKorea.newInstance();
                break;
            case 31:
                fragment = FragmentOman.newInstance();
                break;
            case 32:
                fragment = FragmentPakistan.newInstance();
                break;
            case 33:
                fragment = FragmentPalestine.newInstance();
                break;
            case 34:
                fragment = FragmentPhilippines.newInstance();
                break;
            case 35:
                fragment = FragmentQatar.newInstance();
                break;
            case 36:
                fragment = FragmentRussia_2.newInstance();
                break;
            case 37:
                fragment = FragmentSaudiArabia.newInstance();
                break;
            case 38:
                fragment = FragmentSingapore.newInstance();
                break;
            case 39:
                fragment = FragmentSouthKorea.newInstance();
                break;
            case 40:
                fragment = FragmentSriLanka.newInstance();
                break;
            case 41:
                fragment = FragmentSyria.newInstance();
                break;
            case 42:
                fragment = FragmentTaiwan.newInstance();
                break;
            case 43:
                fragment = FragmentTajikistan.newInstance();
                break;
            case 44:
                fragment = FragmentThailand.newInstance();
                break;
            case 45:
                fragment = FragmentTurkey_2.newInstance();
                break;
            case 46:
                fragment = FragmentTurkmenistan.newInstance();
                break;
            case 47:
                fragment = FragmentUnitedArabEmirates.newInstance();
                break;
            case 48:
                fragment = FragmentUzbekistan.newInstance();
                break;
            case 49:
                fragment = FragmentVietnam.newInstance();
                break;
            case 50:
                fragment = FragmentYemen.newInstance();
                break;

            default:
                return null;
        }


        return fragment;
    }

    @Override
    public int getItemCount() {
        return 51;
    }
}
