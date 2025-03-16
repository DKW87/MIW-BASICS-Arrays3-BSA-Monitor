package controller;

import java.util.Scanner;

/* Dit is een programma voor studenten van de HvA die software engineering volgen.
* In dit programma kunnen ze uitrekenen of zij op schema liggen of mogelijk een negatief BSA zullen krijgen.
* Het is mogelijk voor de studenten om alle cijfers voor de te behalen vakken in te vullen
* en het programma berekend dan het behaalde aantal punten en geeft op basis daarvan advies.
* Ook print het een mooi tabelletje om een mooi overzicht te geven van vakken, cijfers en behaalde punten.
* Mvg,
* Danny Kwant */
public class BSAMonitorMainController {

    // public methods
    public static int bepaalTotaalPunten(int[] mpRijPunten, double[] mpRijCijfers) {
        int aantalBehaaldePunten = 0;
        final double mpGrensVoldoende = 5.5;

        for (int i = 0; i < mpRijPunten.length; i++) {

            if (mpRijCijfers[i] >= mpGrensVoldoende){
                aantalBehaaldePunten = aantalBehaaldePunten + mpRijPunten[i];
            }

        }

        return aantalBehaaldePunten;
    }



    public static void main(String[] args) {

        // variabelen
        final String[] vakNamen = {"Project Fasten Your Seatbelts", "Programming", "Databases", "Personal Skills", "Project Skills", "OOP1", "User Interaction"};
        final String[] tabelHeaders = {"Vak/project", "Cijfer", "Behaalde punten"};
        final int[] vakPunten = {12, 3, 3, 2, 2, 3, 3};
        double[] vakCijfers = new double[vakNamen.length];
        double ingevoerdeCijfer = 0;
        int aantalBehaaldePunten;
        double bsaNorm;
        final double ondergrensCijfer = 1.0;
        final double bovengrensCijfer = 10.0;
        Scanner userInput;

        // Scanner init
        userInput = new Scanner(System.in);

        System.out.println("Voer behaalde cijfers in:");

        for (int i = 0; i < vakNamen.length; i++) {

            System.out.print(vakNamen[i] + ": ");
            ingevoerdeCijfer = userInput.nextDouble();

            if (ingevoerdeCijfer < ondergrensCijfer || ingevoerdeCijfer > bovengrensCijfer) {
                do {
                    System.out.println("Geef een geldige invoer in van 1.0 t/m 10.0.");
                    ingevoerdeCijfer = userInput.nextDouble();
                } while (ingevoerdeCijfer < ondergrensCijfer || ingevoerdeCijfer > bovengrensCijfer);
            }

            vakCijfers[i] = ingevoerdeCijfer;


        }

        System.out.println();

        for (int i = 0; i < vakNamen.length; i++) {

            if (i < 1) {
                System.out.printf("%-35s", tabelHeaders[0]);
                System.out.printf("%-4s", tabelHeaders[1]);
                System.out.printf("%-4s%n", tabelHeaders[2]);
            }

            System.out.printf("%-35s |", vakNamen[i]);
            System.out.printf("%-10.2f", vakCijfers[i]);
            if (vakCijfers[i] >= 5.5) {
                System.out.printf("| %-4d |%n", vakPunten[i]);
            }
            else {
                System.out.printf("| %-4d |%n", 0);
            }
        }

        System.out.println();

        aantalBehaaldePunten = bepaalTotaalPunten(vakPunten, vakCijfers);
        System.out.println("Totaal behaalde studiepunten: " + aantalBehaaldePunten + "/28");

        bsaNorm = (28.0 / 6) * 5;

        if (aantalBehaaldePunten > bsaNorm){
            System.out.print("Lekker bezig! je ligt op schema om geen negatief BSA te krijgen.");
        }
        else {
            System.out.print("Pas op! Je ligt op schema voor een negatief BSA!");
        }



    }

}
