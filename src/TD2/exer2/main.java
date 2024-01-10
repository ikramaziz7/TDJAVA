package TD2.exer2;

public class main {



    public static void main(String[] args) {
        Point1 point1 = new Point1 (6,0);
        System.out.println("Coordonnées du point : (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Distance entre le point et l'origine du repère : " + point1.norme());
    }
}



