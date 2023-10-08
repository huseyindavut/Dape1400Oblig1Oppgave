package Oblig1Oppgave2;

import javax.swing.*;

class Vare{
    private String navn;
    private int antall;
    private double pris;

    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntall() {
        return antall;
    }

    public double getPris() {
        return pris;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAntall(int antall) {
        if(antall>=0){
            this.antall = antall;
        }else {
            antall=0;
            System.out.println("Antall må være større enn null.");
        }
    }

    public void setPris(double pris) {
        if(pris>=0){
            this.pris = pris;
        }else {
            pris=0;
            System.out.println("Prisen må være større enn null");
        }
    }
    public double totalPris(){
        return antall*pris;
    }
}
class kjoper{

}
public class Main {
    public static void main(String[] args) {

        String navn1= JOptionPane.showInputDialog("Skriv inn navnet på det første produktet: ");
        String innAntall1= JOptionPane.showInputDialog("Skriv inn antall til det første produktet: ");
        String innPris1= JOptionPane.showInputDialog("Skriv inn prisen på det første produktet: ");
        String navn2= JOptionPane.showInputDialog("Skriv inn navnet på det andre produktet: ");
        String innAntall2= JOptionPane.showInputDialog("Skriv inn antall til det andre produktet: ");
        String innPris2= JOptionPane.showInputDialog("Skriv inn prisen på det første produktet: ");
        int antall1, antall2;
        double pris1, pris2;
        try {
            antall1=Integer.parseInt(innAntall1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            antall2=Integer.parseInt(innAntall2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            pris1=Double.parseDouble(innPris1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            pris2=Double.parseDouble(innPris2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Vare vare1=new Vare(navn1,antall1,pris1);
        Vare vare2=new Vare(navn2,antall2,pris2);

        double total=vare1.totalPris()+vare2.totalPris();
        System.out.println(total);
    }
}
