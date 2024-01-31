package at.mde.Spiel;

public class Spiel {
    private int iLeistung;
    private String sGenre;
    private int iAnzahlSpieler;

    private int ispielzeit;

    public Spiel() {
        this.iLeistung = 0;
        this.sGenre = "keine Angabe";
        this.iAnzahlSpieler = 0;
        this.ispielzeit = 0;
    }

    public Spiel(int iLeistung, String sGenre, int iAnzahlSpieler, int ispielzeit) {
        this.iLeistung = iLeistung;
        this.sGenre = sGenre;
        this.iAnzahlSpieler = iAnzahlSpieler;
        this.ispielzeit = ispielzeit;
    }

    public int getispielzeit() {
        return ispielzeit;
    }

    public void setispielzeit(int ispielzeit) {
        this.ispielzeit = ispielzeit;
    }

    public int getiLeistung() {
        return iLeistung;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public String getsGenre() {
        return sGenre;
    }

    public int getiAnzahlSpieler() {
        return iAnzahlSpieler;
    }

    public void setiAnzahlSpieler(int iAnzahlSpieler) {
        this.iAnzahlSpieler = iAnzahlSpieler;
    }

    public void setsGenre(String sGenre) {
        this.sGenre = sGenre;
    }

    public String getInfoSpiel() {
        return "Spiel Genre ist " + this.getsGenre() +
                " mit Leistung " + this.getiLeistung() +
                " und das Spiel ist für " + this.getiAnzahlSpieler() + " Spieler ausgelegt " +
                "ispielzeit " + this.getispielzeit() + " Stunden";
    }

    public int getLadenhoehe() {return (0);
    };
}
