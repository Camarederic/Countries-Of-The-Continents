package com.camarederic.countriesofthecontinents.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.camarederic.countriesofthecontinents.R;
import com.camarederic.countriesofthecontinents.ViewPagerAdapterAfrica;
import com.camarederic.countriesofthecontinents.ViewPagerAdapterEurope;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class AfricaActivity extends AppCompatActivity {

    private TabLayout tabLayoutAfrica;
    private ViewPager2 viewPagerAfrica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_africa);

        tabLayoutAfrica = findViewById(R.id.tabLayoutAfrica);
        viewPagerAfrica = findViewById(R.id.viewPagerAfrica);

        ViewPagerAdapterAfrica adapterAfrica = new ViewPagerAdapterAfrica(getSupportFragmentManager(), getLifecycle());

        viewPagerAfrica.setAdapter(adapterAfrica);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutAfrica, viewPagerAfrica,
                true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position){
                    case 0:
                        tab.setText("Continent Africa");
                        break;
                    case 1:
                        tab.setText("Algeria");
                        break;
                    case 2:
                        tab.setText("Angola");
                        break;
                    case 3:
                        tab.setText("Benin");
                        break;
                    case 4:
                        tab.setText("Botswana");
                        break;
                    case 5:
                        tab.setText("Burkina Faso");
                        break;
                    case 6:
                        tab.setText("Burundi");
                        break;
                    case 7:
                        tab.setText("Cameroon");
                        break;
                    case 8:
                        tab.setText("Canary Islands");
                        break;
                    case 9:
                        tab.setText("Cape Verde");
                        break;
                    case 10:
                        tab.setText("Central African Republic");
                        break;
                    case 11:
                        tab.setText("Ceuta");
                        break;
                    case 12:
                        tab.setText("Chad");
                        break;
                    case 13:
                        tab.setText("Comoros");
                        break;
                    case 14:
                        tab.setText("Côte d'Ivoire");
                        break;
                    case 15:
                        tab.setText("Democratic Republic of the Congo");
                        break;
                    case 16:
                        tab.setText("Djibouti");
                        break;
                    case 17:
                        tab.setText("Egypt");
                        break;
                    case 18:
                        tab.setText("Equatorial Guinea");
                        break;
                    case 19:
                        tab.setText("Eritrea");
                        break;
                    case 20:
                        tab.setText("Eswatini");
                        break;
                    case 21:
                        tab.setText("Ethiopia");
                        break;
                    case 22:
                        tab.setText("French Southern and Antarctic Lands");
                        break;
                    case 23:
                        tab.setText("Gabon");
                        break;
                    case 24:
                        tab.setText("Gambia");
                        break;
                    case 25:
                        tab.setText("Ghana");
                        break;
                    case 26:
                        tab.setText("Guinea");
                        break;
                    case 27:
                        tab.setText("Guinea-Bissau");
                        break;
                    case 28:
                        tab.setText("Kenya");
                        break;
                    case 29:
                        tab.setText("Lesotho");
                        break;
                    case 30:
                        tab.setText("Liberia");
                        break;
                    case 31:
                        tab.setText("Libya");
                        break;
                    case 32:
                        tab.setText("Madagascar");
                        break;
                    case 33:
                        tab.setText("Madeira");
                        break;
                    case 34:
                        tab.setText("Malawi");
                        break;
                    case 35:
                        tab.setText("Mali");
                        break;
                    case 36:
                        tab.setText("Mauritania");
                        break;
                    case 37:
                        tab.setText("Mauritius");
                        break;
                    case 38:
                        tab.setText("Mayotte");
                        break;
                    case 39:
                        tab.setText("Melilla");
                        break;
                    case 40:
                        tab.setText("Morocco");
                        break;
                    case 41:
                        tab.setText("Mozambique");
                        break;
                    case 42:
                        tab.setText("Namibia");
                        break;
                    case 43:
                        tab.setText("Niger");
                        break;
                    case 44:
                        tab.setText("Nigeria");
                        break;
                    case 45:
                        tab.setText("Republic of the Congo");
                        break;
                    case 46:
                        tab.setText("Réunion");
                        break;
                    case 47:
                        tab.setText("Rwanda");
                        break;
                    case 48:
                        tab.setText("Saint Helena, Ascension and Tristan da Cunha");
                        break;
                    case 49:
                        tab.setText("São Tomé and Príncipe");
                        break;
                    case 50:
                        tab.setText("Senegal");
                        break;
                    case 51:
                        tab.setText("Seychelles");
                        break;
                    case 52:
                        tab.setText("Sierra Leone");
                        break;
                    case 53:
                        tab.setText("Somalia");
                        break;
                    case 54:
                        tab.setText("Somaliland");
                        break;
                    case 55:
                        tab.setText("South Africa");
                        break;
                    case 56:
                        tab.setText("South Sudan");
                        break;
                    case 57:
                        tab.setText("Sudan");
                        break;
                    case 58:
                        tab.setText("Tanzania");
                        break;
                    case 59:
                        tab.setText("Togo");
                        break;
                    case 60:
                        tab.setText("Tunisia");
                        break;
                    case 61:
                        tab.setText("Uganda");
                        break;
                    case 62:
                        tab.setText("Western Sahara");
                        break;
                    case 63:
                        tab.setText("Zambia");
                        break;
                    case 64:
                        tab.setText("Zimbabwe");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();


    }
}