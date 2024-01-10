package TD3.exo2;


class PointNom extends Point {
    private char nom;

    public PointNom(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    public void setPointNom(int x, int y, char nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public void affCoordNom() {
        System.out.println("Coordonnees : " + x + " " + y + ", Nom : " + nom);
    }
}