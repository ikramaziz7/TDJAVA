package TD2.exer3;

public class main {
    public static void main(String[] args) {
        Livre livre1 = new Livre();
        livre1.setTitre("Le Petit Prince");
        livre1.setAuteur("Antoine de Saint-Exupéry");
        livre1.setPrix(9.99);
        livre1.setAnnee(1943);

        Livre livre2 = new Livre("Harry Potter", "J.K. Rowling", 19.99, 1997);

        System.out.println(livre1.toString());
        System.out.println(livre2.toString());
    }
}
