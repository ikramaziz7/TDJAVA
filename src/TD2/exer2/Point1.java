package TD2.exer2;

public class Point1 {


    private double x;
    private double y;

    public Point1(int x, int y) {
    }


    // Constructeur par défaut
    public void Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Constructeur d'initialisation
    public void Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Méthodes d'accès aux attributs
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Méthode pour calculer la distance entre le point et l'origine du repère
    public double norme() {
        return Math.sqrt(x * x + y * y);
    }
}
