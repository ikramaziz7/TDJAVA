package TD3.exo6;



public class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    public Rectangle() {
        this.longueur = 0;
        this.largeur = 0;
    }

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(double longueur, double largeur, String nom) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.nom = nom;
    }

    // Accesseurs et mutateurs pour les attributs longueur et largeur

    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }

    public double getAire() {
        return longueur * largeur;
    }
}