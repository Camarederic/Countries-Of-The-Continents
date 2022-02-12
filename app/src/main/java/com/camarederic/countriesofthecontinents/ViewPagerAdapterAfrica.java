package com.camarederic.countriesofthecontinents;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.camarederic.countriesofthecontinents.fragments.FragmentAfrica;
import com.camarederic.countriesofthecontinents.fragments.FragmentAlgeria;
import com.camarederic.countriesofthecontinents.fragments.FragmentAngola;
import com.camarederic.countriesofthecontinents.fragments.FragmentBenin;
import com.camarederic.countriesofthecontinents.fragments.FragmentBotswana;
import com.camarederic.countriesofthecontinents.fragments.FragmentBurkinaFaso;
import com.camarederic.countriesofthecontinents.fragments.FragmentBurundi;
import com.camarederic.countriesofthecontinents.fragments.FragmentCameroon;
import com.camarederic.countriesofthecontinents.fragments.FragmentCanaryIslands;
import com.camarederic.countriesofthecontinents.fragments.FragmentCapeVerde;
import com.camarederic.countriesofthecontinents.fragments.FragmentCentralAfricanRepublic;
import com.camarederic.countriesofthecontinents.fragments.FragmentCeuta;
import com.camarederic.countriesofthecontinents.fragments.FragmentChad;
import com.camarederic.countriesofthecontinents.fragments.FragmentComoros;
import com.camarederic.countriesofthecontinents.fragments.FragmentCoteDIvoire;
import com.camarederic.countriesofthecontinents.fragments.FragmentDemocraticRepublicOfTheCongo;
import com.camarederic.countriesofthecontinents.fragments.FragmentDjibouti;
import com.camarederic.countriesofthecontinents.fragments.FragmentEgypt;
import com.camarederic.countriesofthecontinents.fragments.FragmentEquatorialGuinea;
import com.camarederic.countriesofthecontinents.fragments.FragmentEritrea;
import com.camarederic.countriesofthecontinents.fragments.FragmentEswatini;
import com.camarederic.countriesofthecontinents.fragments.FragmentEthiopia;
import com.camarederic.countriesofthecontinents.fragments.FragmentFrenchSouthernAndAntarcticLands;
import com.camarederic.countriesofthecontinents.fragments.FragmentGabon;
import com.camarederic.countriesofthecontinents.fragments.FragmentGambia;
import com.camarederic.countriesofthecontinents.fragments.FragmentGhana;
import com.camarederic.countriesofthecontinents.fragments.FragmentGuinea;
import com.camarederic.countriesofthecontinents.fragments.FragmentGuineaBissau;
import com.camarederic.countriesofthecontinents.fragments.FragmentKenya;
import com.camarederic.countriesofthecontinents.fragments.FragmentLesotho;
import com.camarederic.countriesofthecontinents.fragments.FragmentLiberia;
import com.camarederic.countriesofthecontinents.fragments.FragmentLibya;
import com.camarederic.countriesofthecontinents.fragments.FragmentMadagascar;
import com.camarederic.countriesofthecontinents.fragments.FragmentMadeira;
import com.camarederic.countriesofthecontinents.fragments.FragmentMalawi;
import com.camarederic.countriesofthecontinents.fragments.FragmentMali;
import com.camarederic.countriesofthecontinents.fragments.FragmentMauritania;
import com.camarederic.countriesofthecontinents.fragments.FragmentMauritius;
import com.camarederic.countriesofthecontinents.fragments.FragmentMayotte;
import com.camarederic.countriesofthecontinents.fragments.FragmentMelilla;
import com.camarederic.countriesofthecontinents.fragments.FragmentMorocco;
import com.camarederic.countriesofthecontinents.fragments.FragmentMozambique;
import com.camarederic.countriesofthecontinents.fragments.FragmentNamibia;
import com.camarederic.countriesofthecontinents.fragments.FragmentNiger;
import com.camarederic.countriesofthecontinents.fragments.FragmentNigeria;
import com.camarederic.countriesofthecontinents.fragments.FragmentRepublicOfTheCongo;
import com.camarederic.countriesofthecontinents.fragments.FragmentReunion;
import com.camarederic.countriesofthecontinents.fragments.FragmentRwanda;
import com.camarederic.countriesofthecontinents.fragments.FragmentSaintHelenaAscensionAndTristanDaCunha;
import com.camarederic.countriesofthecontinents.fragments.FragmentSaoTomeAndPrincipe;
import com.camarederic.countriesofthecontinents.fragments.FragmentSenegal;
import com.camarederic.countriesofthecontinents.fragments.FragmentSeychelles;
import com.camarederic.countriesofthecontinents.fragments.FragmentSierraLeone;
import com.camarederic.countriesofthecontinents.fragments.FragmentSomalia;
import com.camarederic.countriesofthecontinents.fragments.FragmentSomaliland;
import com.camarederic.countriesofthecontinents.fragments.FragmentSouthAfrica;
import com.camarederic.countriesofthecontinents.fragments.FragmentSouthSudan;
import com.camarederic.countriesofthecontinents.fragments.FragmentSudan;
import com.camarederic.countriesofthecontinents.fragments.FragmentTanzania;
import com.camarederic.countriesofthecontinents.fragments.FragmentTogo;
import com.camarederic.countriesofthecontinents.fragments.FragmentTunisia;
import com.camarederic.countriesofthecontinents.fragments.FragmentUganda;
import com.camarederic.countriesofthecontinents.fragments.FragmentWesternSahara;
import com.camarederic.countriesofthecontinents.fragments.FragmentZambia;
import com.camarederic.countriesofthecontinents.fragments.FragmentZimbabwe;

public class ViewPagerAdapterAfrica extends FragmentStateAdapter {

    public ViewPagerAdapterAfrica(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;
        switch (position) {
            case 0:
                fragment = FragmentAfrica.newInstance();
                break;
            case 1:
                fragment = FragmentAlgeria.newInstance();
                break;
            case 2:
                fragment = FragmentAngola.newInstance();
                break;
            case 3:
                fragment = FragmentBenin.newInstance();
                break;
            case 4:
                fragment = FragmentBotswana.newInstance();
                break;
            case 5:
                fragment = FragmentBurkinaFaso.newInstance();
                break;
            case 6:
                fragment = FragmentBurundi.newInstance();
                break;
            case 7:
                fragment = FragmentCameroon.newInstance();
                break;
            case 8:
                fragment = FragmentCanaryIslands.newInstance();
                break;
            case 9:
                fragment = FragmentCapeVerde.newInstance();
                break;
            case 10:
                fragment = FragmentCentralAfricanRepublic.newInstance();
                break;
            case 11:
                fragment = FragmentCeuta.newInstance();
                break;
            case 12:
                fragment = FragmentChad.newInstance();
                break;
            case 13:
                fragment = FragmentComoros.newInstance();
                break;
            case 14:
                fragment = FragmentCoteDIvoire.newInstance();
                break;
            case 15:
                fragment = FragmentDemocraticRepublicOfTheCongo.newInstance();
                break;
            case 16:
                fragment = FragmentDjibouti.newInstance();
                break;
            case 17:
                fragment = FragmentEgypt.newInstance();
                break;
            case 18:
                fragment = FragmentEquatorialGuinea.newInstance();
                break;
            case 19:
                fragment = FragmentEritrea.newInstance();
                break;
            case 20:
                fragment = FragmentEswatini.newInstance();
                break;
            case 21:
                fragment = FragmentEthiopia.newInstance();
                break;
            case 22:
                fragment = FragmentFrenchSouthernAndAntarcticLands.newInstance();
                break;
            case 23:
                fragment = FragmentGabon.newInstance();
                break;
            case 24:
                fragment = FragmentGambia.newInstance();
                break;
            case 25:
                fragment = FragmentGhana.newInstance();
                break;
            case 26:
                fragment = FragmentGuinea.newInstance();
                break;
            case 27:
                fragment = FragmentGuineaBissau.newInstance();
                break;
            case 28:
                fragment = FragmentKenya.newInstance();
                break;
            case 29:
                fragment = FragmentLesotho.newInstance();
                break;
            case 30:
                fragment = FragmentLiberia.newInstance();
                break;
            case 31:
                fragment = FragmentLibya.newInstance();
                break;
            case 32:
                fragment = FragmentMadagascar.newInstance();
                break;
            case 33:
                fragment = FragmentMadeira.newInstance();
                break;
            case 34:
                fragment = FragmentMalawi.newInstance();
                break;
            case 35:
                fragment = FragmentMali.newInstance();
                break;
            case 36:
                fragment= FragmentMauritania.newInstance();
                break;
            case 37:
                fragment = FragmentMauritius.newInstance();
                break;
            case 38:
                fragment = FragmentMayotte.newInstance();
                break;
            case 39:
                fragment = FragmentMelilla.newInstance();
                break;
            case 40:
                fragment = FragmentMorocco.newInstance();
                break;
            case 41:
                fragment = FragmentMozambique.newInstance();
                break;
            case 42:
                fragment = FragmentNamibia.newInstance();
                break;
            case 43:
                fragment = FragmentNiger.newInstance();
                break;
            case 44:
                fragment = FragmentNigeria.newInstance();
                break;
            case 45:
                fragment = FragmentRepublicOfTheCongo.newInstance();
                break;
            case 46:
                fragment = FragmentReunion.newInstance();
                break;
            case 47:
                fragment = FragmentRwanda.newInstance();
                break;
            case 48:
                fragment = FragmentSaintHelenaAscensionAndTristanDaCunha.newInstance();
                break;
            case 49:
                fragment = FragmentSaoTomeAndPrincipe.newInstance();
                break;
            case 50:
                fragment = FragmentSenegal.newInstance();
                break;
            case 51:
                fragment = FragmentSeychelles.newInstance();
                break;
            case 52:
                fragment = FragmentSierraLeone.newInstance();
                break;
            case 53:
                fragment = FragmentSomalia.newInstance();
                break;
            case 54:
                fragment = FragmentSomaliland.newInstance();
                break;
            case 55:
                fragment = FragmentSouthAfrica.newInstance();
                break;
            case 56:
                fragment = FragmentSouthSudan.newInstance();
                break;
            case 57:
                fragment = FragmentSudan.newInstance();
                break;
            case 58:
                fragment = FragmentTanzania.newInstance();
                break;
            case 59:
                fragment = FragmentTogo.newInstance();
                break;
            case 60:
                fragment = FragmentTunisia.newInstance();
                break;
            case 61:
                fragment = FragmentUganda.newInstance();
                break;
            case 62:
                fragment = FragmentWesternSahara.newInstance();
                break;
            case 63:
                fragment = FragmentZambia.newInstance();
                break;
            case 64:
                fragment = FragmentZimbabwe.newInstance();
                break;


            default:
                return null;


        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 65;
    }
}
