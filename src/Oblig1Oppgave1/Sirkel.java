package Oblig1Oppgave1;

import java.text.DecimalFormat;

public class Sirkel {
    public static double beregneSirkelensDiameter(double radius) {
        double diameter = radius * 2;
        return diameter;
    }
    private static double beregneSirkelensOmkrets(double radius){
        double omkrets = (2*Math.PI) * radius;
        return omkrets;
    }
    private static double beregneSirkelensAreal(double radius){
        double areal = Math.PI * radius * Math.pow(radius,2);
        return areal;
    }

    public static void main(String[] args) {

        double radius = 23.5;
        double diameteren = radius * 2;
        double omkretsen = (2*Math.PI) * radius;
        double arealen = Math.PI * radius * radius;

        String omkrets = String.format("%.2f", omkretsen);
        String areal = String.format("%.2f", arealen);
        String diameter = String.format("%.2f", diameteren);


        System.out.println("Arealet av sirkelen med radius 23.5 "+areal);
        System.out.println("Omkretsen av sirkelen med radius 23.5 er "+omkrets);
        System.out.println("Diameteren til sirkelen er med radius 23.5 er "+diameter);

    }
}
