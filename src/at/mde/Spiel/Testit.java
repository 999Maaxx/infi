package at.mde.Spiel;

import java.util.ArrayList;
import java.util.Random;

public class Testit {
    public static void main(String[] args) {
        Random r = new Random();

        // Teste den Videospiel-Laden mit Videospielen
        //Spiel spielLaden = new Spiel(50, "Marktplatz 456", 3, 60.0);

        Spiel spiel1 = new Spiel(300, "Action", 2, 20);
        Spiel spiel2 = new Spiel(250, "RPG", 1, 30);
        Spiel spiel3 = new Spiel(200, "Adventure", 4, 15);

        Laden.addLaden(spiel1);
        Laden.addLaden(spiel2);
        Laden.addLaden(spiel3);

        System.out.println("Anzahl der Spiele im Laden: " + Laden.getSpieleImLaden());
        System.out.println("Freie Plätze im Laden: " + Laden.getFreiePlaetze());
        System.out.println("Durchschnittliche Spielzeit im Laden: " + Laden.getDurchschnittlicheSpielzeit() + " Stunden");
    }
}
