package TD2.exer4;

public class Main {
    public static void main(String[] args) {
        Temps temps1 = new Temps(10, 30, 45);
        System.out.println("Temps 1: " + temps1);

        Temps temps2 = new Temps(5, 15);
        System.out.println("Temps 2: " + temps2);

        temps1.ajouterHeures(2);
        temps1.ajouterMinutes(20);
        temps1.ajouterSecondes(10);
        System.out.println("Temps 1 après ajout: " + temps1);
    }
}
