package TD3.exo6;


public class Disque extends Figure {
    private Point centre;
    private double rayon;

    public Disque() {
        this.centre = new Point(0, 0);
        this.rayon = 0;
    }

    public Disque(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public Disque(Point centre, double rayon, String nom) {
        this.centre = centre;
        this.rayon = rayon;
        this.nom = nom;
    }

    // Accesseurs et mutateurs pour les attributs centre et rayon

    public double getPerimeter() {
        return 2 * Math.PI * rayon;
    }

    public double getAire() {
        return Math.PI * rayon * rayon;
    }
}
