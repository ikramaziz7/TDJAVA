package TD3.exo3;


public class Main {
    public static void main(String[] args) {
        Centre centre = new Centre(0, 0, "Centre");
        Cercle cercle = new Cercle(0, 0, "Cercle", 5);

        centre.affiche();
        System.out.println("Périmètre du cercle : " + cercle.calculerPerimetre());
        System.out.println("Surface du cercle : " + cercle.calculerSurface());
    }
}
