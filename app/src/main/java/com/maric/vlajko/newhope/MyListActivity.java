package com.maric.vlajko.newhope;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MyListActivity extends AppCompatActivity {

    ListView myListView;
    PlanetsAdapter arrayAdapter;
    MyPlanet myPlanets[] = {
            new MyPlanet("p1","Mercury","91,691,000 km","4,879 km","0","0","Hi Celsius"),
            new MyPlanet("p2","Venus","41,400,000 km","12,104 km","0","0","Rrrr"),
            new MyPlanet("p3","Terra","this far | |","12,742 km","7.3 billion","we take over","Zdravo Patak"),
            new MyPlanet("p4","Mars","78,340,000 km","6,779 km","Matt Damon","13","Zappp"),
            new MyPlanet("p5","Jupiter","628,730,000 km","139,822 km","0","0","Nom nom"),
            new MyPlanet("p6","Saturn","1,275,000,000 km","116,464 km","0","0","Wooop"),
            new MyPlanet("p7","Uranus","2,723,950,000 km","50,724 km","0","0","Splash"),
            new MyPlanet("p8","Neptune","4,351,400,000 km","49,244 km","0","0","Klik"),
            new MyPlanet("p9","Pluto","7,500,000,000 km","2,372 km","0","0","Mi mi")
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);
        myListView = (ListView)findViewById(R.id.myListView);
       // planetList = new ArrayList<>(Arrays.asList("Merkur","Venera","Zemlja","Mars","Jupiter","Saturn","Uran","Neptun","Pluton"));
        arrayAdapter = new PlanetsAdapter(getApplicationContext(),R.layout.planet_row,myPlanets);


        myListView.setAdapter(arrayAdapter);
    }
}
