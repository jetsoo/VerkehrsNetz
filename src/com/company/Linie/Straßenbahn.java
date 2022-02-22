package com.company.Linie;

import com.company.Linie.Linie;

import java.util.HashMap;

public class Straßenbahn extends Linie {

    public Straßenbahn(HashMap<String,Double[]> map,Integer nummer,Boolean inBetrieb,String name){
        super(map,nummer,inBetrieb,false,name);
    }

    @Override
    void printInfo() {
        System.out.println("Dies ist eine StraßenBahn der Linie " + this.getLinienNr() );
    }
}
