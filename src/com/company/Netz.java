package com.company;

import com.company.Linie.Linie;

import java.util.ArrayList;
import java.util.HashMap;

public class Netz {

    private ArrayList<Linie> linienListe;
    private String name;
    private HashMap<Integer,Double> preise;

    public Netz(ArrayList<Linie> linienListe,String name,HashMap<Integer,Double> preise) {
        this.linienListe = linienListe;
        this.name = name;
        this.preise = preise;
    }

    public HashMap<Integer, Double> getPreise() {
        return preise;
    }

    public void setPreise(HashMap<Integer, Double> preise) {
        this.preise = preise;
    }

    public ArrayList<Linie> getLinienListe() {
        return linienListe;
    }

    public void setLinienListe(ArrayList<Linie> linienListe) {
        this.linienListe = linienListe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
