package at.mde.basis;

import java.util.Random;

public class ControlStructurs3 {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        System.out.println("Die Zufallszahl ist:"+randomNumber);

        if(randomNumber<20){
            System.out.println("Die ausgegebene Zahl ist Mini");
        }else if(randomNumber>20 && randomNumber<50){
            System.out.println("Die ausgegebene Zahl ist Medium");
        }else{
            System.out.println("Die ausgegebene Zahl ist Large");
        }

        // Gib die Zufallszahl aus

        // Wenn die Zahl kleiner ist als 20  gib aus "Mini"
        // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
        // Wenn die Zahl größer als 50 ist gib aus "Large"


    }

}
