package com.maric.vlajko.newhope;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Vlajko on 06-Feb-16.
 */
public class PlanetsAdapter extends ArrayAdapter<MyPlanet> {

    private Context mContext;
    private int mResourceId;
    MyPlanet myPlanets[] = null;

    public PlanetsAdapter(Context context, int resource, MyPlanet[] objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResourceId = resource;
        this.myPlanets = objects;

    }

    @Override
    public MyPlanet getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        PlaceHolder holder = null;
        if (row==null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            row = inflater.inflate(mResourceId, parent, false);
            holder = new PlaceHolder();

            holder.planetName = (TextView) row.findViewById(R.id.planetNameText);;
            holder.planetDistance = (TextView) row.findViewById(R.id.distance);;
            holder.planetDiameter = (TextView) row.findViewById(R.id.diameter);;
            holder.noOfHumans = (TextView) row.findViewById(R.id.numberOfHumans);;
            holder.noOfRobots = (TextView) row.findViewById(R.id.numberOfRobots);;
            holder.offGreeting = (TextView) row.findViewById(R.id.officialGreeting);;
            holder.planetImage = (ImageView)row.findViewById(R.id.myPlanetImage);;

            row.setTag(holder);
        }else {
            holder = (PlaceHolder) row.getTag();
        }


        MyPlanet planet = myPlanets[position];

        holder.planetImage.setOnClickListener(ListListener);
        Integer rowPosition = position;
        holder.planetImage.setTag(rowPosition);

        holder.planetName.setText(planet.getPlanetName());
        holder.planetDistance.setText(planet.getDistanceFromEarth());
        holder.planetDiameter.setText(planet.getDiameter());
        holder.noOfHumans.setText(planet.getNumberOfHumans());
        holder.noOfRobots.setText(planet.getNumberOfRobots());
        holder.offGreeting.setText(planet.getOfficialGreeting());

        int resId = mContext.getResources().getIdentifier(planet.getPlanetImage(), "drawable", mContext.getPackageName());
        holder.planetImage.setImageResource(resId);

        return row;

    }
    View.OnClickListener ListListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        Integer viewPosition = (Integer) v.getTag();
            MyPlanet planet = myPlanets[viewPosition];
        }
    };
    private static class PlaceHolder{
        TextView planetName;
        TextView planetDistance;
        TextView planetDiameter;
        TextView noOfHumans;
        TextView noOfRobots;
        TextView offGreeting;
        ImageView planetImage;

    }
}
