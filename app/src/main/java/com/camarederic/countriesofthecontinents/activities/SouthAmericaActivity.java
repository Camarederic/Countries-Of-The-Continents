package com.camarederic.countriesofthecontinents.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.camarederic.countriesofthecontinents.R;
import com.camarederic.countriesofthecontinents.ViewPagerAdapterSouthAmerica;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class SouthAmericaActivity extends AppCompatActivity {

    private TabLayout tabLayoutSouthAmerica;
    private ViewPager2 viewPagerSouthAmerica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south_america);

        tabLayoutSouthAmerica = findViewById(R.id.tabLayoutSouthAmerica);
        viewPagerSouthAmerica = findViewById(R.id.viewPagerSouthAmerica);

        ViewPagerAdapterSouthAmerica adapterSouthAmerica = new ViewPagerAdapterSouthAmerica(getSupportFragmentManager(), getLifecycle());
        viewPagerSouthAmerica.setAdapter(adapterSouthAmerica);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutSouthAmerica, viewPagerSouthAmerica,
                true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Continent South America");
                        break;
                    case 1:
                        tab.setText("Argentina");
                        break;
                    case 2:
                        tab.setText("Bolivia");
                        break;
                    case 3:
                        tab.setText("Bouvet Island");
                        break;
                    case 4:
                        tab.setText("Brazil");
                        break;
                    case 5:
                        tab.setText("Chile");
                        break;
                    case 6:
                        tab.setText("Colombia");
                        break;
                    case 7:
                        tab.setText("Ecuador");
                        break;
                    case 8:
                        tab.setText("Falkland Islands");
                        break;
                    case 9:
                        tab.setText("French Guiana");
                        break;
                    case 10:
                        tab.setText("Guyana");
                        break;
                    case 11:
                        tab.setText("Paraguay");
                        break;
                    case 12:
                        tab.setText("Peru");
                        break;
                    case 13:
                        tab.setText("South Georgia and the South Sandwich Islands");
                        break;
                    case 14:
                        tab.setText("Suriname");
                        break;
                    case 15:
                        tab.setText("Uruguay");
                        break;
                    case 16:
                        tab.setText("Venezuela");
                        break;

                }
            }
        });
        tabLayoutMediator.attach();


    }
}