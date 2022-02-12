package com.camarederic.countriesofthecontinents.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.camarederic.countriesofthecontinents.R;
import com.camarederic.countriesofthecontinents.ViewPagerAdapterAustraliaOceania;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class AustraliaOceaniaActivity extends AppCompatActivity {

    private TabLayout tabLayoutAustraliaOceania;
    private ViewPager2 viewPagerAustraliaOceania;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_australia_oceania);

        tabLayoutAustraliaOceania = findViewById(R.id.tabLayoutAustraliaOceania);
        viewPagerAustraliaOceania = findViewById(R.id.viewPagerAustraliaOceania);

        ViewPagerAdapterAustraliaOceania adapterAustraliaOceania = new ViewPagerAdapterAustraliaOceania(getSupportFragmentManager(),getLifecycle());

        viewPagerAustraliaOceania.setAdapter(adapterAustraliaOceania);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutAustraliaOceania, viewPagerAustraliaOceania,
                true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position){
                    case 0:
                        tab.setText("Continent Australia");
                        break;
                    case 1:
                        tab.setText("Fiji");
                        break;
                    case 2:
                        tab.setText("Kiribati");
                        break;
                    case 3:
                        tab.setText("Marshall Islands");
                        break;
                    case 4:
                        tab.setText("Micronesia");
                        break;
                    case 5:
                        tab.setText("Nauru");
                        break;
                    case 6:
                        tab.setText("New Zealand");
                        break;
                    case 7:
                        tab.setText("Palau");
                        break;
                    case 8:
                        tab.setText("Papua New Guinea");
                        break;
                    case 9:
                        tab.setText("Samoa");
                        break;
                    case 10:
                        tab.setText("Solomon Islands");
                        break;
                    case 11:
                        tab.setText("Tonga");
                        break;
                    case 12:
                        tab.setText("Tuvalu");
                        break;
                    case 13:
                        tab.setText("Vanuatu");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }
}