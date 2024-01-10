package TD2.exer6;

public class Main {
    public static void main(String[] args) {
        Banque compte = new Banque(1, 5000.75f, "AB 1200");
        System.out.println(compte.avoirlnf(1));
        System.out.println("Solde du compte: " + compte.avoirSolde());
        compte.deposer(500);
        System.out.println(compte.avoirlnf(1));
        System.out.println("Solde du compte: " + compte.avoirSolde());
        compte.retirer(200);
        System.out.println(compte.avoirlnf(1));
        System.out.println("Solde du compte: " + compte.avoirSolde());
    }
}