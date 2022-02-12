package com.camarederic.countriesofthecontinents.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.camarederic.countriesofthecontinents.R;
import com.camarederic.countriesofthecontinents.ViewPagerAdapterEurope;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class EuropeActivity extends AppCompatActivity {

    private TabLayout tabLayoutEurope;
    private ViewPager2 viewPagerEurope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_europe);

        tabLayoutEurope = findViewById(R.id.tabLayoutEurope);
        viewPagerEurope = findViewById(R.id.viewPagerEurope);

        ViewPagerAdapterEurope adapterEurope = new ViewPagerAdapterEurope(getSupportFragmentManager(),getLifecycle());

        viewPagerEurope.setAdapter(adapterEurope);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutEurope, viewPagerEurope,
                true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position){
                    case 0:
                        tab.setText("Continent Europe");
                        break;
                    case 1:
                        tab.setText("Albania");
                        break;
                    case 2:
                        tab.setText("Andorra");
                        break;
                    case 3:
                        tab.setText("Armenia");
                        break;
                    case 4:
                        tab.setText("Austria");
                        break;
                    case 5:
                        tab.setText("Azerbaijan");
                        break;
                    case 6:
                        tab.setText("Belarus");
                        break;
                    case 7:
                        tab.setText("Belgium");
                        break;
                    case 8:
                        tab.setText("Bosnia and Herzegovina");
                        break;
                    case 9:
                        tab.setText("Bulgaria");
                        break;
                    case 10:
                        tab.setText("Croatia");
                        break;
                    case 11:
                        tab.setText("Cyprus");
                        break;
                    case 12:
                        tab.setText("Czechia");
                        break;
                    case 13:
                        tab.setText("Denmark");
                        break;
                    case 14:
                        tab.setText("Estonia");
                        break;
                    case 15:
                        tab.setText("Finland");
                        break;
                    case 16:
                        tab.setText("France");
                        break;
                    case 17:
                        tab.setText("Georgia");
                        break;
                    case 18:
                        tab.setText("Germany");
                        break;
                    case 19:
                        tab.setText("Greece");
                        break;
                    case 20:
                        tab.setText("Hungary");
                        break;
                    case 21:
                        tab.setText("Iceland");
                        break;
                    case 22:
                        tab.setText("Ireland");
                        break;
                    case 23:
                        tab.setText("Italy");
                        break;
                    case 24:
                        tab.setText("Latvia");
                        break;
                    case 25:
                        tab.setText("Liechtenstein");
                        break;
                    case 26:
                        tab.setText("Lithuania");
                        break;
                    case 27:
                        tab.setText("Luxembourg");
                        break;
                    case 28:
                        tab.setText("Malta");
                        break;
                    case 29:
                        tab.setText("Moldova");
                        break;
                    case 30:
                        tab.setText("Monaco");
                        break;
                    case 31:
                        tab.setText("Montenegro");
                        break;
                    case 32:
                        tab.setText("Netherlands");
                        break;
                    case 33:
                        tab.setText("North Macedonia");
                        break;
                    case 34:
                        tab.setText("Norway");
                        break;
                    case 35:
                        tab.setText("Poland");
                        break;
                    case 36:
                        tab.setText("Portugal");
                        break;
                    case 37:
                        tab.setText("Romania");
                        break;
                    case 38:
                        tab.setText("Russia");
                        break;
                    case 39:
                        tab.setText("San Marino");
                        break;
                    case 40:
                        tab.setText("Serbia");
                        break;
                    case 41:
                        tab.setText("Slovakia");
                        break;
                    case 42:
                        tab.setText("Slovenia");
                        break;
                    case 43:
                        tab.setText("Spain");
                        break;
                    case 44:
                        tab.setText("Sweden");
                        break;
                    case 45:
                        tab.setText("Switzerland");
                        break;
                    case 46:
                        tab.setText("Turkey");
                        break;
                    case 47:
                        tab.setText("Ukraine");
                        break;
                    case 48:
                        tab.setText("United Kingdom");
                        break;
                    case 49:
                        tab.setText("Vatican City");
                        break;

                }

            }
        });
        tabLayoutMediator.attach();
    }
}