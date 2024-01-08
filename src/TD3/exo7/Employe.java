package TD3.exo7;

abstract class Employe {
    protected String nom;
    protected String prenom;

    public Employe() {
        // Constructeur par défaut
    }

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Accesseurs et mutateurs pour nom et prenom

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    public abstract double gains();
}






