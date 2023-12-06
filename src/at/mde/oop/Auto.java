package at.mde.oop;

public class Auto {
    private int iLeistung;
    private String sFarbe;
    private int iAnzahlraeder;


    public Auto() {
        this.iLeistung=0;
        this.sFarbe="keine Angabe";
        this.iAnzahlraeder=0;
    }

    public Auto(int iLeistung, String sFarbe, int iAnzahlraeder) {
        this.iLeistung = iLeistung;
        this.sFarbe = sFarbe;
        this.iAnzahlraeder = iAnzahlraeder;
    }

    public int getiLeistung() {
        return iLeistung;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public int getiAnzahlraeder() {
        return iAnzahlraeder;
    }

    public void setiAnzahlraeder(int iAnzahlraeder) {
        this.iAnzahlraeder = iAnzahlraeder;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;


    }

    public String getInfoAuto(){
        return "Auto Farbe ist "+ this.getsFarbe()+
                " mit Leistung " + this.getiLeistung() +
                " und das Auto hat "+ this.getiAnzahlraeder()+" R\u00e4der";
    }

}
