package com.camarederic.countriesofthecontinents.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.camarederic.countriesofthecontinents.R;
import com.camarederic.countriesofthecontinents.ViewPagerAdapterAntarctica;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class AntarcticaActivity extends AppCompatActivity {

    private TabLayout tabLayoutAntarctica;
    private ViewPager2 viewPagerAntarctica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antarctica);

        tabLayoutAntarctica = findViewById(R.id.tabLayoutAntarctica);
        viewPagerAntarctica = findViewById(R.id.viewPagerAntarctica);

        ViewPagerAdapterAntarctica adapterAntarctica = new ViewPagerAdapterAntarctica(getSupportFragmentManager(), getLifecycle());

        viewPagerAntarctica.setAdapter(adapterAntarctica);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutAntarctica, viewPagerAntarctica,
                true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Continent Antarctica");
                        break;
                    case 1:
                        tab.setText("Adélie Land");
                        break;
                    case 2:
                        tab.setText("Argentine Antarctica");
                        break;
                    case 3:
                        tab.setText("Australian Antarctic Territory");
                        break;
                    case 4:
                        tab.setText("British Antarctic Territory");
                        break;
                    case 5:
                        tab.setText("Chilean Antarctic Territory");
                        break;
                    case 6:
                        tab.setText("Peter I Island");
                        break;
                    case 7:
                        tab.setText("Queen Maud Land");
                        break;
                    case 8:
                        tab.setText("Ross Dependency");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }
}