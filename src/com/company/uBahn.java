package com.company;

import java.util.HashMap;

public class uBahn extends Linie{

    public  uBahn(HashMap<String,Double[]> map, Integer nummer,boolean inBetrieb,String name){
        super(map,nummer,inBetrieb,true,name);
    }

    @Override
    void printInfo() {
        System.out.println("Dies ist eine Ubahn der Linie " + this.getLinienNr() );
    }
}
