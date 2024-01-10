package TD2.exer5;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 10);
        System.out.println(rectangle1.toString());
        System.out.println("Périmètre : " + rectangle1.perimetre());
        System.out.println("Aire : " + rectangle1.aire());
        System.out.println("Est un carré : " + rectangle1.isCarre());

        Rectangle rectangle2 = new Rectangle(rectangle1);
        rectangle2.setLongueur(7);
        rectangle2.setLargeur(7);
        System.out.println(rectangle2.toString());
        System.out.println("Périmètre : " + rectangle2.perimetre());
        System.out.println("Aire : " + rectangle2.aire());
        System.out.println("Est un carré : " + rectangle2.isCarre());
    }
}
