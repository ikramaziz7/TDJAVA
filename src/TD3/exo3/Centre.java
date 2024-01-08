package TD3.exo3;

class Centre extends Point {
    private String nom;

    public Centre(int x, int y, String nom) {
        super(x, y);
        this.nom = nom;
    }

    public void affNom() {
        System.out.println("Nom : " + nom);
    }

    public void affiche() {
        super.affCoord();
        affNom();
    }
}

class Cercle extends Centre {
    private double rayon;

    public Cercle(int x, int y, String nom, double rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }

    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
}

