package com.company;
import java.util.List;
import java.util.ArrayList;

public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    public Benutzer(String vorName, String nachName){
        this.nachName=nachName;
        this.vorName=vorName;
        this.sport=new ArrayList<Sport>();
    }

    //Getters und Setters
    public String getVorName(){
        return vorName;
    }
    public String getNachName(){
        return nachName;
    }
    public void setVorName(String neuVorName){
        this.vorName=neuVorName;
    }
    public void setNachName(String neuNachName){
        this.nachName=neuNachName;
    }


    //Neu Sport addieren
    public void neuSport(Sport neuSport){
        sport.add(neuSport);
    }

    //Zeit fuer jedes Sport
    public void kalkuliereZeit(){
        System.out.println("Zeit fuer jedes Sport:");
        for (Sport x:sport) {
            System.out.println(x.getZeit());
        }
    }

    //Zeit fuer ein selbes Sport
    public double kalkulliereZeit(Sport x){
        for (Sport y:sport) {
            if (x == y){
                return y.getZeit();
            }
        }
        return 0;
    }
    //Durchschnitt des Zeit
    public double durchschnittZeit(){
        double sum=0, no=0;
        for (Sport x:sport) {
            sum+=x.getZeit();
            no++;
        }
        return sum/no;
    }
}
