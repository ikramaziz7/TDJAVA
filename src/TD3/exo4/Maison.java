package TD3.exo4;

public class Maison extends Batiment {
    private int nbChambres;

    public Maison() {
    }

    public Maison(String adresse, int nbChambres) {
        super(adresse);
        this.nbChambres = nbChambres;
    }

    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    @Override
    public String toString() {
        return "Maison [adresse=" + getAdresse() + ", nbChambres=" + nbChambres + "]";
    }
}