package TD3.exo7;


class TravailleurCommission extends Employe {
    private double salaire;
    private double commission;
    private int quantite;

    public TravailleurCommission() {
        // Constructeur par défaut
    }

    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
    }

    // Accesseurs et mutateurs pour salaire, commission et quantite

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "TravailleurCommission{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                ", commission=" + commission +
                ", quantite=" + quantite +
                '}';
    }

    @Override
    public double gains() {
        return salaire + (commission * quantite);
    }
}
