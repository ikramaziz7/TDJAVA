package TD3.exo7;

public class TestEmploye {
    public static void main(String[] args) {
        // Test des classes Employe, Patron, TravailleurCommission et TravailleurHoraire
        Patron patron = new Patron("Dupont", "Jean", 5000);
        System.out.println(patron.toString());
        System.out.println("Gains du patron : " + patron.gains());

        TravailleurCommission travailleurCommission = new TravailleurCommission("Martin", "Sophie", 2000, 0.1);
        travailleurCommission.setQuantite(100);
        System.out.println(travailleurCommission.toString());
        System.out.println("Gains du travailleur à la commission : " + travailleurCommission.gains());

        TravailleurHoraire travailleurHoraire = new TravailleurHoraire("Leclerc", "Paul", 20);
        travailleurHoraire.setHeures(80);
        System.out.println(travailleurHoraire.toString());
        System.out.println("Gains du travailleur horaire : " + travailleurHoraire.gains());
    }
}