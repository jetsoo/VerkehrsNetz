package com.company.Linie;

import java.util.HashMap;

public abstract class Linie {

    private HashMap<String,Double[]>  fahrZeiten;
    private Integer linienNr;
    private Boolean inBetrieb;
    private Boolean nightLine;
    private String name;


    public Linie(HashMap<String, Double[]> fahrZeiten, Integer linienNr, Boolean inBetrieb, Boolean nightLine,String name) {
        this.fahrZeiten = fahrZeiten;
        this.linienNr = linienNr;
        this.inBetrieb = inBetrieb;
        this.nightLine = nightLine;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Double[]> getFahrZeiten() {
        return fahrZeiten;
    }

    public void setFahrZeiten(HashMap<String, Double[]> fahrZeiten) {
        this.fahrZeiten = fahrZeiten;
    }

    public Integer getLinienNr() {
        return linienNr;
    }

    public void setLinienNr(Integer linienNr) {
        this.linienNr = linienNr;
    }

    public Boolean getInBetrieb() {
        return inBetrieb;
    }

    public void setInBetrieb(Boolean inBetrieb) {
        this.inBetrieb = inBetrieb;
    }

    public Boolean getNightLine() {
        return nightLine;
    }

    public void setNightLine(Boolean nightLine) {
        this.nightLine = nightLine;
    }

    public Linie() {

    }

    abstract void printInfo();

    @Override
    public String toString() {
        return "Linie{" +
                "fahrZeiten=" + fahrZeiten +
                ", linienNr=" + linienNr +
                ", inBetrieb=" + inBetrieb +
                ", nightLine=" + nightLine +
                '}';
    }
}
