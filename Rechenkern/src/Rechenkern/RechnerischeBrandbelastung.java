package Rechenkern;

import java.util.Scanner;

public class RechnerischeBrandbelastung {

    float gesamtMasse;
    float heizwert;
    float abbrandfaktor;
    float q_i;

    public void berechneProdukt() {
        Scanner input = new Scanner(System.in);

        System.out.print("Gesamtmasse: ");
        float gesamtMasse = input.nextFloat();

        System.out.print("Heizwert: ");
        float heizwert = input.nextFloat();

        System.out.print("Abbrandfaktor: " );
        float abbrandfaktor = input.nextFloat();

        q_i = gesamtMasse * heizwert * abbrandfaktor;
        //System.out.println("q_i = " + q_i);
    }
}
