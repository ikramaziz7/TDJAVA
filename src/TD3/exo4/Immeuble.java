package TD3.exo4;

public class Immeuble extends Batiment {
    private int nbAppart;

    public Immeuble() {
    }

    public Immeuble(String adresse, int nbAppart) {
        super(adresse);
        this.nbAppart = nbAppart;
    }

    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    @Override
    public String toString() {
        return "Immeuble [adresse=" + getAdresse() + ", nbAppart=" + nbAppart + "]";
    }
}

