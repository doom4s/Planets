package com.maric.vlajko.newhope;

/**
 * Created by Vlajko on 06-Feb-16.
 */
public class MyPlanet {

    private String planetImage;
    private String planetName;
    private String distanceFromEarth;
    private String diameter;
    private String numberOfHumans;
    private String numberOfRobots;
    private String officialGreeting;

    public MyPlanet(String planetImage, String planetName, String distanceFromEarth, String diameter, String numberOfHumans, String numberOfRobots, String officialGreeting){
        this.planetImage=planetImage;
        this.planetName = planetName;
        this.distanceFromEarth = distanceFromEarth;
        this.diameter = diameter;
        this.numberOfHumans = numberOfHumans;
        this.numberOfRobots = numberOfRobots;
        this.officialGreeting = officialGreeting;
    }

    public String getPlanetName() {
        return planetName;
    }

    public String getDistanceFromEarth() {
        return distanceFromEarth;
    }

    public String getDiameter() {
        return diameter;
    }

    public String getNumberOfHumans() {
        return numberOfHumans;
    }

    public String getNumberOfRobots() {
        return numberOfRobots;
    }

    public String getPlanetImage() {
        return planetImage;
    }

    public String getOfficialGreeting() {
        return officialGreeting;
    }
}
