package TD2.exer6;

class Banque {
    private int NCompte;
    private float Solde;
    private String CIN;
    private String Banque;

    Banque(int NCompte, float Solde, String CIN) {
        this.NCompte = NCompte;
        this.Solde = Solde;
        this.CIN = CIN;
        this.Banque = "Banque";
    }

    void deposer(float Somme) {
        Solde += Somme;
    }

    void retirer(float Somme) {
        if (Solde >= Somme) {
            Solde -= Somme;
        } else {
            System.out.println("Le solde du compte est insuffisant.");
        }
    }

    float avoirSolde() {
        return Solde;
    }

    String avoirlnf(int numCompte) {
        return "Numéro de compte: " + numCompte + " | Nom et Prénom: " + CIN + " | Solde: " + Solde;
    }
}