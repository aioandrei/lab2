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

    public void neuSport(Sport neuSport){
        sport.add(neuSport);
    }

    public void kalkuliereZeit(){
        System.out.println("Zeit fuer jede Sport:");
        for (Sport x:sport) {
            System.out.println(x.getZeit());
        }
    }

    public double kalkulliereZeit(Sport x){
        for (Sport y:sport) {
            if (x == y){
                return y.getZeit();
            }
        }
        return 0;
    }

    public double durchschnittZeit(){
        double sum=0, no=0;
        for (Sport x:sport) {
            sum+=x.getZeit();
            no++;
        }
        return sum/no;
    }
}
