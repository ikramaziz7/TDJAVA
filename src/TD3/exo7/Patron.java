package TD3.exo7;


class Patron extends Employe {
    private double salaire;

    public Patron() {
        // Constructeur par défaut
    }

    public Patron(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    // Accesseurs et mutateurs pour salaire

    @Override
    public String toString() {
        return "Patron{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                '}';
    }

    @Override
    public double gains() {
        return salaire;
    }
}