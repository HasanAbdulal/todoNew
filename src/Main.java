// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//@formatter:on
//        int prixTicketCinema = 8;
//        int age = 15;
//        boolean estEtudiant = false;
        /*if (age <= 15 || estEtudiant) {
            prixTicketCinema = 6;
        } else {
            prixTicketCinema = 8;
        }*/
//        prixTicketCinema = (age <= 15 || estEtudiant) ? 6 : 8;
//        System.out.println("Le prix du ticket est de " + prixTicketCinema + " euros");
        /*int hour = 10;
        String timeOfDay;
        if (hour < 12) {
            timeOfDay = "morning";
        } else if (hour >= 12 && hour < 18) {
            timeOfDay = "afternoon";
        } else {
            timeOfDay = "evening";
        }
        System.out.println(timeOfDay);*/
        /*int marathonPosition = 4;
        String medal;
        switch (marathonPosition) {
            case 1:
                medal = "Gold";
                System.out.println("Congratulations, you have won " + medal + " medal");
                break;
            case 2:
                medal = "Silver";
                System.out.println("Congratulations, you have won " + medal + " medal");
                break;
            case 3:
                medal = "Bronze";
                System.out.println("Congratulations, you have won " + medal + " medal");
                break;
            default:
                medal = "None";
                System.out.println("Sorry, this time you have not won " + medal + " medal");
        }*/

        /*int trous = 0;
        while (trous <= 18) {
            trous++;
            System.out.println("Vous avez joué le trou numéro " + trous);
        }
        System.out.println("Vous avez fini le parcours");*/

        /*int trous = 0;
        do {
            trous++;
            System.out.println("Vous avez joué le trou numéro " + trous);
        } while (trous < 0);
        System.out.println("Vous avez fini le parcours");*/

        /*int trous = 0;
        for (trous = 0; trous <= 100; trous++) {
            System.out.println("Vous avez joué le trou numéro " + trous);
        }*/

        /*for (int trous = 0; trous < 100; trous = trous + 2) {
            System.out.println("Vous avez joué le trou numéro " + trous);
        }*/

        for (int i = 100; i > 0; i--) {
            System.out.println("You have n times " + i);
        }
    }
}