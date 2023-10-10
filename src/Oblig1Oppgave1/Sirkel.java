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
        double innDiameter = radius * 2;
        double innOmkretsen = (2*Math.PI) * radius;
        double innArealen = Math.PI * Math.pow(radius,2);

        String omkrets = String.format("%.2f", innOmkretsen);
        String areal = String.format("%.2f", innArealen);
        String diameter = String.format("%.2f", innDiameter);


        System.out.println("Arealet av sirkelen med radius 23.5 "+areal);
        System.out.println("Omkretsen av sirkelen med radius 23.5 er "+omkrets);
        System.out.println("Diameteren til sirkelen er med radius 23.5 er "+diameter);

    }
}
