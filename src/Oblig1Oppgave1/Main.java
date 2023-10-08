package Oblig1Oppgave1;

class regnesDiameter {
    public static double regneSirkelensDiameter(double radius){
        double diameter = 2*radius;
        return diameter;
    }

    public static void main(String[] args) {
        double radius =23.5;
        double diameter = regneSirkelensDiameter(radius);
        System.out.println("Srikelens diameter er: "+diameter);
    }
}

class sirkelensArea {

    public static double regneSirkelensAreal(double radius) {
        double areal = Math.PI * radius * radius;
        return areal;
    }

    public static void main(String[] args) {
        double radius = 23.5;
        double areal = regneSirkelensAreal(radius);
        System.out.println("Sirkelens areal er :"+areal);
    }

}

class sirkelensOmkrets {

    public static double regneSirkelensOmkrets(double radius){
        double omkrets = 2*Math.PI*radius;
        return omkrets;
    }

    public static void main(String[] args) {
        double radius =23.5;
        double omkrets =regneSirkelensOmkrets(radius);
        System.out.println("Sirkelens omkretsen er :"+omkrets);

    }

}

