package com.company.Linie;

import com.company.Linie.Linie;

import java.util.HashMap;

public class Bus extends Linie {

    public Bus(HashMap<String,Double[]> map,Integer nummer,Boolean inBetrieb,String name){
        super(map,nummer,inBetrieb,true,name);
    }


    @Override
    void printInfo() {
        System.out.println("Dies ist ein Bus der Linie " + this.getLinienNr() );
    }
}
