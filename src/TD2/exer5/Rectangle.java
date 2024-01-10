package TD2.exer5;

public class Rectangle {
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

    public Rectangle(Rectangle rectangle) {
        this.longueur = rectangle.getLongueur();
        this.largeur = rectangle.getLargeur();
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        if (longueur > 0) {
            this.longueur = longueur;
        }
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        if (largeur > 0) {
            this.largeur = largeur;
        }
    }

    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    public double aire() {
        return longueur * largeur;
    }

    public boolean isCarre() {
        return longueur == largeur;
    }

    @Override
    public String toString() {
        return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
    }
}
