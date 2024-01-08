package TD3.exo8;

// Interface pour les employés
interface Employe {
    String getNom();
    String getPrenom();
    double gains();
}

// Classe implémentant l'interface Employe pour les employés généraux
class EmployeGeneral implements Employe {
    private String nom;
    private String prenom;

    public EmployeGeneral(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public double gains() {
        // Gains pour les employés généraux (à définir selon les besoins)
        return 0.0;
    }
}

// Interface pour les employés avec salaire fixe
interface SalaireFixe {
    double getSalaire();
}

// Interface pour les employés avec commission
interface Commission {
    double getCommission();
    int getQuantiteVendue();
}

// Classe pour les patrons
class Patron implements Employe, SalaireFixe {
    private String nom;
    private String prenom;
    private double salaire;

    public Patron(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public double gains() {
        return salaire;
    }

    @Override
    public double getSalaire() {
        return salaire;
    }
}

// Classe pour les travailleurs à commission
class TravailleurCommission implements Employe, SalaireFixe, Commission {
    private String nom;
    private String prenom;
    private double salaireFixe;
    private double commission;
    private int quantiteVendue;

    public TravailleurCommission(String nom, String prenom, double salaireFixe, double commission) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaireFixe = salaireFixe;
        this.commission = commission;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public double gains() {
        return salaireFixe + (commission * quantiteVendue);
    }

    @Override
    public double getSalaire() {
        return salaireFixe;
    }

    @Override
    public double getCommission() {
        return commission;
    }

    @Override
    public int getQuantiteVendue() {
        return quantiteVendue;
    }
}

// Classe pour les travailleurs horaires
class TravailleurHoraire implements Employe, SalaireFixe {
    private String nom;
    private String prenom;
    private double retribution;
    private double heuresTravaillees;

    public TravailleurHoraire(String nom, String prenom, double retribution) {
        this.nom = nom;
        this.prenom = prenom;
        this.retribution = retribution;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public double gains() {
        return retribution * heuresTravaillees;
    }

    @Override
    public double getSalaire() {
        return retribution;
    }
}

