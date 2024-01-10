package TD3.exo6;

public class TestFigure {
    public static void main(String[] args) {
        Disque disque = new Disque(new Point(0, 0), 5, "Mon disque");
        Rectangle rectangle = new Rectangle(10, 5, "Mon rectangle");

        System.out.println(disque);
        System.out.println("Périmètre du disque: " + disque.getPerimeter());
        System.out.println("Aire du disque: " + disque.getAire());

        System.out.println(rectangle);
        System.out.println("Périmètre du rectangle: " + rectangle.getPerimeter());
        System.out.println("Aire du rectangle: " + rectangle.getAire());
    }
}
