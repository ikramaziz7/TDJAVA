package TD3.exo2;

public class main {


    public static void main(String[] args) {
        PointNom pointAvecNom = new PointNom(3, 5, 'A');
        pointAvecNom.affCoordNom();

        pointAvecNom.setPointNom(7, 9, 'B');
        pointAvecNom.affCoordNom();

        pointAvecNom.setNom('C');
        pointAvecNom.affCoordNom();
    }
}