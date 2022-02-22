package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        //creating a linie
        HashMap<String,Double[]> stationen38 = new HashMap<>();
        Double[] ersteStation = {11.10,12.10,13.10,14.10,15.10,16.10,17.10,18.10,19.10,20.10};
        Double[] zweiteStation = {11.15,12.15,13.15,14.15,15.16,16.15,17.15,18.15,19.15,20.15};
        Double[] dritteStation = {11.20,12.20,13.20,14.20,15.20,16.20,17.20,18.20,19.20,20.20};
        stationen38.put("Silbergasse",ersteStation);
        stationen38.put("Gatterburggasse",zweiteStation);
        stationen38.put("Hardtgasse",dritteStation);

        Linie achtUndDreißig = new Straßenbahn(stationen38,38,true,"83er");

        HashMap<String,Double[]> stationenU6 = new HashMap<>();
        Double[] ersteStationB = {11.03,12.03,13.03,14.03,15.03,16.03,17.03,18.03};
        Double[] zweiteStationB = {11.06,12.06,13.06,14.06,15.06,16.06,17.06,18.06};
        Double[] dritteStationB = {11.09,12.09,13.09,14.09,15.09,16.09,17.09,18.09};
        stationenU6.put("Spittelau",ersteStationB);
        stationenU6.put("Nußdorfer Straße",zweiteStationB);
        stationenU6.put("Währinger Straße",dritteStationB);

        Linie uSechs = new uBahn(stationenU6,6,true,"U6");

        HashMap<String,Double[]> stationen35A = new HashMap<>();
        Double[] ersteStationC = {12.35,14.35,16.35,18.35};
        Double[] zweiteStationC = {12.45,14.45,16.45,18.45};
        Double[] dritteStationC = {12.55,14.55,16.55,18.55};
        stationen35A.put("Krottenbachstraße",ersteStationC);
        stationen35A.put("Glanzing",zweiteStationC);
        stationen35A.put("Salmannsdorf",dritteStationC);

        Linie fünfUndDreißigA = new Bus(stationen35A,35,true,"35A");

        //creating a netz
        ArrayList<Linie> linienList = new ArrayList<>();
        linienList.add(achtUndDreißig);
        linienList.add(uSechs);
        linienList.add(fünfUndDreißigA);

        HashMap<Integer,Double> tagesPreiseWienNetz = new HashMap<>();
        tagesPreiseWienNetz.put(1,2.55);
        tagesPreiseWienNetz.put(2,4.25);
        tagesPreiseWienNetz.put(3,5.95);
        tagesPreiseWienNetz.put(4,7.45);
        Netz wienNetz = new Netz(linienList,"Wien Netz",tagesPreiseWienNetz);

        Scanner scanner = new Scanner(System.in);

        //station suchen
        findStation(wienNetz,scanner);
        //get zeit für station X von Linie X
        fahrPlan(wienNetz,scanner);
        //get preis von Netz X
        preisInfo(wienNetz,scanner);

        scanner.close();

    }

    public  static void findStation(Netz netz,Scanner scanner){
        boolean found = false;
        System.out.println("Enter Station");
        String stationToFind =scanner.nextLine();
        for(Linie linie : netz.getLinienListe()){

            for(String s: linie.getFahrZeiten().keySet()){
                if(s.equals(stationToFind)){
                    found = true;
                }
            }
        }
        if(found){
            System.out.println("Station found!");
        }
        else{
            System.out.println("Station NOT found!");
        }
    }

    public static void preisInfo(Netz netz,Scanner scanner){
        System.out.println("Wie viele Tage möchten Sie fahren?");
        int anzahlTage = scanner.nextInt();
        System.out.println("Preis beträgt: " + netz.getPreise().get(anzahlTage) + "€");
    }

    public static void fahrPlan(Netz netz,Scanner scanner)  {
        System.out.println("Wählen Sie eine Linie für Fahrzeiten");
        for(int i = 0; i < netz.getLinienListe().size();i++){
            System.out.print(i + "Linie " + netz.getLinienListe().get(i).getName() + "\t");
        }
        System.out.println();
        int linienWahl = scanner.nextInt() ;
        scanner.nextLine();

        System.out.println("Wählen Sie eine Station");
        for (String s : netz.getLinienListe().get(linienWahl).getFahrZeiten().keySet()) {
            System.out.println("Station: " + s);
        }

        String stationWahl = scanner.nextLine();
        try {
            System.out.println(Arrays.toString(netz.getLinienListe().get(linienWahl).getFahrZeiten().get(stationWahl)));
        }
        catch(Exception e){
            throw new NoSuchElementException("Linie nicht verfügbar");
        }

    }
}
