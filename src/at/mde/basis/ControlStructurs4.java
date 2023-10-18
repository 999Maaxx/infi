package at.mde.basis;

import java.util.Random;

public class ControlStructurs4 {
    public static void main(String[] args) {
        //Erstelle zwei Zufallszahlen zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int randomNumber1 = random.nextInt (100);

        System.out.println("Die erste Zufallszahl ist:"+randomNumber);
        System.out.println("Die zweite Zufallszahl lautet:"+randomNumber1);
        //Wenn die erste kleiner als die zweite UND die erste Zahl kleiner ist al 50
        //dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"
if (randomNumber<randomNumber1 && randomNumber<50){
    System.out.println("Zufallszahl 1: "+randomNumber+ " ist kleiner als Zufallszahl 2: "+randomNumber1+ " und Mini");
}
        //Wenn die erste Zahl kleiner ist als 30 oder die zweite ZAhl kleiner ist als 30
        //dann gib aus "Eine der beiden ist kleiner als 30"
if (randomNumber<30||randomNumber1<30){
    System.out.println("Eine der beiden Zahlen ist kleiner "+randomNumber+" oder "+randomNumber1);
}

        //Wenn die erste Zahl kleiner ist als 50 UND die zweite ZAhl ungleich 50 ist
        //dann gib aus "Erste Zahl klein, zweite kein 50iger"
if (randomNumber<50 && randomNumber1!=50){
    System.out.println("Erste Zahl klein: " +randomNumber+", zweite kein 50iger: " +randomNumber1);
}

    }
}
