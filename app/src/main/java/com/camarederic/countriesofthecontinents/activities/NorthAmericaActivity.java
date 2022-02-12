package com.camarederic.countriesofthecontinents.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.camarederic.countriesofthecontinents.R;
import com.camarederic.countriesofthecontinents.ViewPagerAdapterNorthAmerica;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class NorthAmericaActivity extends AppCompatActivity {

    private TabLayout tabLayoutNorthAmerica;
    private ViewPager2 viewPagerNorthAmerica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_america);

        tabLayoutNorthAmerica = findViewById(R.id.tabLayoutNorthAmerica);
        viewPagerNorthAmerica = findViewById(R.id.viewPagerNorthAmerica);

        ViewPagerAdapterNorthAmerica adapterNorthAmerica = new ViewPagerAdapterNorthAmerica(getSupportFragmentManager(), getLifecycle());

        viewPagerNorthAmerica.setAdapter(adapterNorthAmerica);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutNorthAmerica, viewPagerNorthAmerica,
                true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Continent North America");
                        break;
                    case 1:
                        tab.setText("Anguilla");
                        break;
                    case 2:
                        tab.setText("Antigua and Barbuda");
                        break;
                    case 3:
                        tab.setText("Aruba");
                        break;
                    case 4:
                        tab.setText("Bahamas");
                        break;
                    case 5:
                        tab.setText("Barbados");
                        break;
                    case 6:
                        tab.setText("Belize");
                        break;
                    case 7:
                        tab.setText("Bermuda");
                        break;
                    case 8:
                        tab.setText("Bonaire");
                        break;
                    case 9:
                        tab.setText("British Virgin Islands");
                        break;
                    case 10:
                        tab.setText("Canada");
                        break;
                    case 11:
                        tab.setText("Cayman Islands");
                        break;
                    case 12:
                        tab.setText("Clipperton Island");
                        break;
                    case 13:
                        tab.setText("Costa Rica");
                        break;
                    case 14:
                        tab.setText("Cuba");
                        break;
                    case 15:
                        tab.setText("Curaçao");
                        break;
                    case 16:
                        tab.setText("Dominica");
                        break;
                    case 17:
                        tab.setText("Dominican Republic");
                        break;
                    case 18:
                        tab.setText("El Salvador");
                        break;
                    case 19:
                        tab.setText("Federal Dependencies of Venezuela");
                        break;
                    case 20:
                        tab.setText("Greenland");
                        break;
                    case 21:
                        tab.setText("Grenada");
                        break;
                    case 22:
                        tab.setText("Guadeloupe");
                        break;
                    case 23:
                        tab.setText("Guatemala");
                        break;
                    case 24:
                        tab.setText("Haiti");
                        break;
                    case 25:
                        tab.setText("Honduras");
                        break;
                    case 26:
                        tab.setText("Jamaica");
                        break;
                    case 27:
                        tab.setText("Martinique");
                        break;
                    case 28:
                        tab.setText("Mexico");
                        break;
                    case 29:
                        tab.setText("Montserrat");
                        break;
                    case 30:
                        tab.setText("Nicaragua");
                        break;
                    case 31:
                        tab.setText("Nueva Esparta");
                        break;
                    case 32:
                        tab.setText("Panama");
                        break;
                    case 33:
                        tab.setText("Puerto Rico");
                        break;
                    case 34:
                        tab.setText("Saba");
                        break;
                    case 35:
                        tab.setText("San Andrés and Providencia");
                        break;
                    case 36:
                        tab.setText("Saint Barthélemy");
                        break;
                    case 37:
                        tab.setText("Saint Kitts and Nevis");
                        break;
                    case 38:
                        tab.setText("Saint Lucia");
                        break;
                    case 39:
                        tab.setText("Saint Martin");
                        break;
                    case 40:
                        tab.setText("Saint Pierre and Miquelon");
                        break;
                    case 41:
                        tab.setText("Saint Vincent and the Grenadines");
                        break;
                    case 42:
                        tab.setText("Sint Eustatius");
                        break;
                    case 43:
                        tab.setText("Sint Maarten");
                        break;
                    case 44:
                        tab.setText("Trinidad and Tobago");
                        break;
                    case 45:
                        tab.setText("Turks and Caicos Islands");
                        break;
                    case 46:
                        tab.setText("United States");
                        break;
                    case 47:
                        tab.setText("United States Virgin Islands");
                        break;

                }
            }
        });
        tabLayoutMediator.attach();


    }
}