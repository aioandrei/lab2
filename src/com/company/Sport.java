package com.company;

public abstract class Sport {
    private double zeit;
    //Constructor
    public Sport(double zeit){
        this.zeit=zeit;
    }
    //Getters und Setters
    public double getZeit() {
        return zeit;
    }
    public void setZeit(double neuZeit) {
        this.zeit=neuZeit;
    }

}
