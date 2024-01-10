package TD3.exo7;


class TravailleurHoraire extends Employe {
    private double retribution;
    private double heures;

    public TravailleurHoraire() {
        // Constructeur par défaut
    }

    public TravailleurHoraire(String nom, String prenom, double retribution) {
        super(nom, prenom);
        this.retribution = retribution;
    }

    // Accesseurs et mutateurs pour retribution et heures

    public void setHeures(double heures) {
        this.heures = heures;
    }

    @Override
    public String toString() {
        return "TravailleurHoraire{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", retribution=" + retribution +
                ", heures=" + heures +
                '}';
    }

    @Override
    public double gains() {
        return retribution * heures;
    }
}
