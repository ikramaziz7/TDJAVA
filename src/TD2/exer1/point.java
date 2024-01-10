package TD2.exer1;

public class point {

    private char nom;
    private double abscisse;

    public  point(char nom, double abscisse) {
        this.nom=nom;
        this.abscisse=abscisse;

    }

    public void affiche() {
        System.out.println("Nom du point : " + nom);
        System.out.println("Abscisse du point : " + abscisse);
    }

    public void translate(double valeur) {
        abscisse += valeur;
    }
}
