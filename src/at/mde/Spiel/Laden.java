package at.mde.Spiel;

import java.util.ArrayList;

public class Laden {
    private int verkaufsflaeche;

    private String addresse;

    private int ladenhoehe;

    private double durchschnittspreis;

    static ArrayList<Spiel> spieleliste;

    public Laden(int verkaufsflaeche, String addresse, int ladenhoehe, double durchschnittspreis) {
        this.verkaufsflaeche = verkaufsflaeche;
        this.addresse = addresse;
        this.ladenhoehe = ladenhoehe;
        this.durchschnittspreis = durchschnittspreis;
        this.spieleliste = new ArrayList<Spiel>();
    }

    public int getVerkaufsflaeche() {
        return verkaufsflaeche;
    }

    public void setVerkaufsflaeche(int verkaufsflaeche) {
        this.verkaufsflaeche = verkaufsflaeche;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public int getLadenhoehe() {
        return ladenhoehe;
    }

    public void setLadenhoehe(int ladenhoehe) {
        this.ladenhoehe = ladenhoehe;
    }

    public double getDurchschnittspreis() {
        return durchschnittspreis;
    }

    public void setDurchschnittspreis(double durchschnittspreis) {
        this.durchschnittspreis = durchschnittspreis;
    }

    public static int getSpieleImLaden() {
        return spieleliste.size();
    }

    public static int getFreiePlaetze() {
        return this.verkaufsflaeche - getSpieleImLaden();
    }

    public void addLaden(Spiel spiel) {
        // Überprüfen, ob das Spiel die Ladenhöhe überschreitet
        if (spiel.getLadenhoehe() > this.ladenhoehe) {
            System.out.println("Achtung, dieses Spiel ist zu groß für den Laden!");
        } else if (getFreiePlaetze() > 0) {
            spieleliste.add(spiel);
        } else {
            System.out.println("Leider kein Platz mehr im Laden, versuchen Sie es später erneut!");
        }
    }

    public static double getDurchschnittlicheSpielzeit() {
        double durchschnitt = 0;
        for (Spiel spiel : spieleliste) {
            durchschnitt += spiel.getispielzeit();
        }
        return durchschnitt / getSpieleImLaden();
    }
    // Weitere Funktionen für die Suche nach Spielen nach Genre, Leistung usw.
}
