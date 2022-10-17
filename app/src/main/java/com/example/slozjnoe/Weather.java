package com.example.slozjnoe;

public class Weather {
    private double lat, lon;
    private String timezone;
    private WeatherItem current;

    public Weather(double lat, double lon, String timezone, WeatherItem current) {
        this.lat = lat;
        this.lon = lon;
        this.timezone = timezone;
        this.current = current;
    }

    public double getLat(){
        return lat;
    }
    public void  setLat(double lat){this.lat = lat;}

    public double getLon(){return lon;}
    public void setLon(double lon){this.lon = lon;}
    public String getTimezone(){return timezone;}
    public void setTimezone(String timezone){this.timezone = timezone;}
    public WeatherItem getCurrent() {return current;}
    public void setCurrent(WeatherItem current) { this.current = current;}
}
