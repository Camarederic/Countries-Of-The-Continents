package com.camarederic.countriesofthecontinents.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.camarederic.countriesofthecontinents.AdapterClass;
import com.camarederic.countriesofthecontinents.ModelClass;
import com.camarederic.countriesofthecontinents.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private ArrayList<ModelClass> arrayList;

    private AdapterClass adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        arrayList = new ArrayList<>();

        ModelClass modelClass1 = new ModelClass("countries_of_europe", "Countries of Europe");
        ModelClass modelClass2 = new ModelClass("countries_of_africa","Countries of Africa");
        ModelClass modelClass3 = new ModelClass("countries_of_north_america", "Countries of North America ");
        ModelClass modelClass4 = new ModelClass("countries_of_south_america", "Countries of South America");
        ModelClass modelClass5 = new ModelClass("countries_of_asia", "Countries of Asia");
        ModelClass modelClass6 = new ModelClass("australia", "Australia and Oceania");
        ModelClass modelClass7 = new ModelClass("antarctica", "Antarctica");

        arrayList.add(modelClass1);
        arrayList.add(modelClass2);
        arrayList.add(modelClass3);
        arrayList.add(modelClass4);
        arrayList.add(modelClass5);
        arrayList.add(modelClass6);
        arrayList.add(modelClass7);

        adapter = new AdapterClass(arrayList,this);
        recyclerView.setAdapter(adapter);
    }
}