package com.camarederic.countriesofthecontinents.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.camarederic.countriesofthecontinents.R;
import com.camarederic.countriesofthecontinents.ViewPagerAdapterAsia;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class AsiaActivity extends AppCompatActivity {

    private TabLayout tabLayoutAsia;
    private ViewPager2 viewPagerAsia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia);

        tabLayoutAsia = findViewById(R.id.tabLayoutAsia);
        viewPagerAsia = findViewById(R.id.viewPagerAsia);

        ViewPagerAdapterAsia adapterAsia = new ViewPagerAdapterAsia(getSupportFragmentManager(), getLifecycle());

        viewPagerAsia.setAdapter(adapterAsia);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutAsia, viewPagerAsia,
                true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Continent Asia");
                        break;
                    case 1:
                        tab.setText("Afghanistan");
                        break;
                    case 2:
                        tab.setText("Armenia");
                        break;
                    case 3:
                        tab.setText("Azerbaijan");
                        break;
                    case 4:
                        tab.setText("Bahrain");
                        break;
                    case 5:
                        tab.setText("Bangladesh");
                        break;
                    case 6:
                        tab.setText("Bhutan");
                        break;
                    case 7:
                        tab.setText("Brunei");
                        break;
                    case 8:
                        tab.setText("Cambodia");
                        break;
                    case 9:
                        tab.setText("China");
                        break;
                    case 10:
                        tab.setText("Cyprus");
                        break;
                    case 11:
                        tab.setText("East Timor");
                        break;
                    case 12:
                        tab.setText("Georgia");
                        break;
                    case 13:
                        tab.setText("India");
                        break;
                    case 14:
                        tab.setText("Indonesia");
                        break;
                    case 15:
                        tab.setText("Iran");
                        break;
                    case 16:
                        tab.setText("Iraq");
                        break;
                    case 17:
                        tab.setText("Israel");
                        break;
                    case 18:
                        tab.setText("Japan");
                        break;
                    case 19:
                        tab.setText("Jordan");
                        break;
                    case 20:
                        tab.setText("Kazakhstan");
                        break;
                    case 21:
                        tab.setText("Kuwait");
                        break;
                    case 22:
                        tab.setText("Kyrgyzstan");
                        break;
                    case 23:
                        tab.setText("Laos");
                        break;
                    case 24:
                        tab.setText("Lebanon");
                        break;
                    case 25:
                        tab.setText("Malaysia");
                        break;
                    case 26:
                        tab.setText("Maldives");
                        break;
                    case 27:
                        tab.setText("Mongolia");
                        break;
                    case 28:
                        tab.setText("Myanmar");
                        break;
                    case 29:
                        tab.setText("Nepal");
                        break;
                    case 30:
                        tab.setText("North Korea");
                        break;
                    case 31:
                        tab.setText("Oman");
                        break;
                    case 32:
                        tab.setText("Pakistan");
                        break;
                    case 33:
                        tab.setText("Palestine");
                        break;
                    case 34:
                        tab.setText("Philippines");
                        break;
                    case 35:
                        tab.setText("Qatar");
                        break;
                    case 36:
                        tab.setText("Russia");
                        break;
                    case 37:
                        tab.setText("Saudi Arabia");
                        break;
                    case 38:
                        tab.setText("Singapore");
                        break;
                    case 39:
                        tab.setText("South Korea");
                        break;
                    case 40:
                        tab.setText("Sri Lanka");
                        break;
                    case 41:
                        tab.setText("Syria");
                        break;
                    case 42:
                        tab.setText("Taiwan");
                        break;
                    case 43:
                        tab.setText("Tajikistan");
                        break;
                    case 44:
                        tab.setText("Thailand");
                        break;
                    case 45:
                        tab.setText("Turkey");
                        break;
                    case 46:
                        tab.setText("Turkmenistan");
                        break;
                    case 47:
                        tab.setText("United Arab Emirates");
                        break;
                    case 48:
                        tab.setText("Uzbekistan");
                        break;
                    case 49:
                        tab.setText("Vietnam");
                        break;
                    case 50:
                        tab.setText("Yemen");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();


    }
}