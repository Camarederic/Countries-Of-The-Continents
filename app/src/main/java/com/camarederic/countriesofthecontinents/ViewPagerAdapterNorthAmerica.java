package com.camarederic.countriesofthecontinents;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.camarederic.countriesofthecontinents.fragments.FragmentAnguilla;
import com.camarederic.countriesofthecontinents.fragments.FragmentAntiguaAndBarbuda;
import com.camarederic.countriesofthecontinents.fragments.FragmentAruba;
import com.camarederic.countriesofthecontinents.fragments.FragmentBahamas;
import com.camarederic.countriesofthecontinents.fragments.FragmentBarbados;
import com.camarederic.countriesofthecontinents.fragments.FragmentBelize;
import com.camarederic.countriesofthecontinents.fragments.FragmentBermuda;
import com.camarederic.countriesofthecontinents.fragments.FragmentBonaire;
import com.camarederic.countriesofthecontinents.fragments.FragmentBritishVirginIslands;
import com.camarederic.countriesofthecontinents.fragments.FragmentCanada;
import com.camarederic.countriesofthecontinents.fragments.FragmentCaymanIslands;
import com.camarederic.countriesofthecontinents.fragments.FragmentClippertonIsland;
import com.camarederic.countriesofthecontinents.fragments.FragmentCostaRica;
import com.camarederic.countriesofthecontinents.fragments.FragmentCuba;
import com.camarederic.countriesofthecontinents.fragments.FragmentCuracao;
import com.camarederic.countriesofthecontinents.fragments.FragmentDominica;
import com.camarederic.countriesofthecontinents.fragments.FragmentDominicanRepublic;
import com.camarederic.countriesofthecontinents.fragments.FragmentElSalvador;
import com.camarederic.countriesofthecontinents.fragments.FragmentFederalDependenciesOfVenezuela;
import com.camarederic.countriesofthecontinents.fragments.FragmentGreenland;
import com.camarederic.countriesofthecontinents.fragments.FragmentGrenada;
import com.camarederic.countriesofthecontinents.fragments.FragmentGuadeloupe;
import com.camarederic.countriesofthecontinents.fragments.FragmentGuatemala;
import com.camarederic.countriesofthecontinents.fragments.FragmentHaiti;
import com.camarederic.countriesofthecontinents.fragments.FragmentHonduras;
import com.camarederic.countriesofthecontinents.fragments.FragmentJamaica;
import com.camarederic.countriesofthecontinents.fragments.FragmentMartinique;
import com.camarederic.countriesofthecontinents.fragments.FragmentMexico;
import com.camarederic.countriesofthecontinents.fragments.FragmentMontserrat;
import com.camarederic.countriesofthecontinents.fragments.FragmentNicaragua;
import com.camarederic.countriesofthecontinents.fragments.FragmentNorthAmerica;
import com.camarederic.countriesofthecontinents.fragments.FragmentNuevaEsparta;
import com.camarederic.countriesofthecontinents.fragments.FragmentPanama;
import com.camarederic.countriesofthecontinents.fragments.FragmentPuertoRico;
import com.camarederic.countriesofthecontinents.fragments.FragmentSaba;
import com.camarederic.countriesofthecontinents.fragments.FragmentSaintBarthelemy;
import com.camarederic.countriesofthecontinents.fragments.FragmentSaintKittsAndNevis;
import com.camarederic.countriesofthecontinents.fragments.FragmentSaintLucia;
import com.camarederic.countriesofthecontinents.fragments.FragmentSaintMartin;
import com.camarederic.countriesofthecontinents.fragments.FragmentSaintPierreAndMiquelon;
import com.camarederic.countriesofthecontinents.fragments.FragmentSaintVincentAndTheGrenadines;
import com.camarederic.countriesofthecontinents.fragments.FragmentSanAndresAndProvidencia;
import com.camarederic.countriesofthecontinents.fragments.FragmentSintEustatius;
import com.camarederic.countriesofthecontinents.fragments.FragmentSintMaarten;
import com.camarederic.countriesofthecontinents.fragments.FragmentTrinidadAndTobago;
import com.camarederic.countriesofthecontinents.fragments.FragmentTurksAndCaicosIslands;
import com.camarederic.countriesofthecontinents.fragments.FragmentUnitedStates;
import com.camarederic.countriesofthecontinents.fragments.FragmentUnitedStatesVirginIslands;

public class ViewPagerAdapterNorthAmerica extends FragmentStateAdapter {

    public ViewPagerAdapterNorthAmerica(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;
        switch (position){
            case 0:
                fragment = FragmentNorthAmerica.newInstance();
                break;
            case 1:
                fragment = FragmentAnguilla.newInstance();
                break;
            case 2:
                fragment = FragmentAntiguaAndBarbuda.newInstance();
                break;
            case 3:
                fragment = FragmentAruba.newInstance();
                break;
            case 4:
                fragment = FragmentBahamas.newInstance();
                break;
            case 5:
                fragment = FragmentBarbados.newInstance();
                break;
            case 6:
                fragment = FragmentBelize.newInstance();
                break;
            case 7:
                fragment = FragmentBermuda.newInstance();
                break;
            case 8:
                fragment = FragmentBonaire.newInstance();
                break;
            case 9:
                fragment = FragmentBritishVirginIslands.newInstance();
                break;
            case 10:
                fragment = FragmentCanada.newInstance();
                break;
            case 11:
                fragment = FragmentCaymanIslands.newInstance();
                break;
            case 12:
                fragment = FragmentClippertonIsland.newInstance();
                break;
            case 13:
                fragment = FragmentCostaRica.newInstance();
                break;
            case 14:
                fragment = FragmentCuba.newInstance();
                break;
            case 15:
                fragment = FragmentCuracao.newInstance();
                break;
            case 16:
                fragment = FragmentDominica.newInstance();
                break;
            case 17:
                fragment = FragmentDominicanRepublic.newInstance();
                break;
            case 18:
                fragment = FragmentElSalvador.newInstance();
                break;
            case 19:
                fragment = FragmentFederalDependenciesOfVenezuela.newInstance();
                break;
            case 20:
                fragment = FragmentGreenland.newInstance();
                break;
            case 21:
                fragment = FragmentGrenada.newInstance();
                break;
            case 22:
                fragment = FragmentGuadeloupe.newInstance();
                break;
            case 23:
                fragment = FragmentGuatemala.newInstance();
                break;
            case 24:
                fragment = FragmentHaiti.newInstance();
                break;
            case 25:
                fragment = FragmentHonduras.newInstance();
                break;
            case 26:
                fragment = FragmentJamaica.newInstance();
                break;
            case 27:
                fragment = FragmentMartinique.newInstance();
                break;
            case 28:
                fragment = FragmentMexico.newInstance();
                break;
            case 29:
                fragment = FragmentMontserrat.newInstance();
                break;
            case 30:
                fragment = FragmentNicaragua.newInstance();
                break;
            case 31:
                fragment = FragmentNuevaEsparta.newInstance();
                break;
            case 32:
                fragment = FragmentPanama.newInstance();
                break;
            case 33:
                fragment = FragmentPuertoRico.newInstance();
                break;
            case 34:
                fragment = FragmentSaba.newInstance();
                break;
            case 35:
                fragment = FragmentSanAndresAndProvidencia.newInstance();
                break;
            case 36:
                fragment = FragmentSaintBarthelemy.newInstance();
                break;
            case 37:
                fragment = FragmentSaintKittsAndNevis.newInstance();
                break;
            case 38:
                fragment = FragmentSaintLucia.newInstance();
                break;
            case 39:
                fragment = FragmentSaintMartin.newInstance();
                break;
            case 40:
                fragment = FragmentSaintPierreAndMiquelon.newInstance();
                break;
            case 41:
                fragment = FragmentSaintVincentAndTheGrenadines.newInstance();
                break;
            case 42:
                fragment = FragmentSintEustatius.newInstance();
                break;
            case 43:
                fragment = FragmentSintMaarten.newInstance();
                break;
            case 44:
                fragment = FragmentTrinidadAndTobago.newInstance();
                break;
            case 45:
                fragment = FragmentTurksAndCaicosIslands.newInstance();
                break;
            case 46:
                fragment = FragmentUnitedStates.newInstance();
                break;
            case 47:
                fragment = FragmentUnitedStatesVirginIslands.newInstance();
                break;

            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 48;
    }
}
