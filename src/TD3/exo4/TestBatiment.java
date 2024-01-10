package TD3.exo4;

public class TestBatiment {
    public static void main(String[] args) {
        Batiment batiment = new Batiment("123 Rue du Bâtiment");
        Maison maison = new Maison("456 Rue de la Maison", 3);
        Immeuble immeuble = new Immeuble("789 Rue de l'Immeuble", 10);

        System.out.println(batiment.toString());
        System.out.println(maison.toString());
        System.out.println(immeuble.toString());
    }
}
