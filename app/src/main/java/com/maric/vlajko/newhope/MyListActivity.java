package com.maric.vlajko.newhope;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MyListActivity extends Activity {
    ImageView planetPositionImage;
    ListView myListView;
    private Dialog dialog;
    private TextView title;
    PlanetsAdapter arrayAdapter;
    String planetPositions [] = {
            "p1_position",
            "p2_position",
            "p3_position",
            "p4_position",
            "p5_position",
            "p6_position",
            "p7_position",
            "p8_position",
            "pluto"};
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
        planetPositionImage = (ImageView)findViewById(R.id.planetPosition);
        createDialog();
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                planetPositionImage = (ImageView)dialog.findViewById(R.id.planetPosition);
                int resId = getApplicationContext().getResources().getIdentifier(planetPositions[position], "drawable", getApplicationContext().getPackageName());
                planetPositionImage.setImageResource(resId);
                if (position==2){
                    title.setText(getApplicationContext().getResources().getString(R.string.planetHome));
                }else{title.setText(getApplicationContext().getResources().getString(R.string.planetLocation));}
                dialog.show();
            }
        });
    }
    private void createDialog(){
        dialog = new Dialog(MyListActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_layout);
        title = (TextView)dialog.findViewById(R.id.title);
        dialog.setCancelable(true);
    }
}
