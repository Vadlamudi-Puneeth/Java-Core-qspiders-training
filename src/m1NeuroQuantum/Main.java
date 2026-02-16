package m1NeuroQuantum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Experiment 1 input
        System.out.println("Enter Experiment 1 details:");
        int id1 = sc.nextInt();
        sc.nextLine();
        String title1 = sc.nextLine();
        String researcher1 = sc.nextLine();
        double funding1 = sc.nextDouble();
        sc.nextLine();
        String complexity1 = sc.nextLine();
        int month1 = sc.nextInt();
        int year1 = sc.nextInt();

        ExperimentInfo e1 = new ExperimentInfo(
                id1, title1, researcher1, funding1,
                complexity1, month1, year1
        );

        // Experiment 2 input
        sc.nextLine();
        System.out.println("Enter Experiment 2 details:");
        int id2 = sc.nextInt();
        sc.nextLine();
        String title2 = sc.nextLine();
        String researcher2 = sc.nextLine();
        double funding2 = sc.nextDouble();
        sc.nextLine();
        String complexity2 = sc.nextLine();
        int month2 = sc.nextInt();
        int year2 = sc.nextInt();

        ExperimentInfo e2 = new ExperimentInfo(
                id2, title2, researcher2, funding2,
                complexity2, month2, year2
        );

        // Calculate months active
        int months1 = Experiment.getMonthsActive(month1, year1);
        int months2 = Experiment.getMonthsActive(month2, year2);

        // Calculate scores
        double innovation1 = e1.calculateInnovationScore(months1);
        double resource1 = e1.calculateResourceConsumption(months1);

        double innovation2 = e2.calculateInnovationScore(months2);
        double resource2 = e2.calculateResourceConsumption(months2);

        // Output
        System.out.println("Experiment Summary:");

        System.out.println(e1.getExperimentTitle() + " by " + e1.getLeadResearcher());
        System.out.println("Months Active: " + months1);
        System.out.println("Innovation Score: " + innovation1);
        System.out.println("Resource Consumption: " + resource1);

        System.out.println(e2.getExperimentTitle() + " by " + e2.getLeadResearcher());
        System.out.println("Months Active: " + months2);
        System.out.println("Innovation Score: " + innovation2);
        System.out.println("Resource Consumption: " + resource2);

        // Higher impact experiment
        Experiment higher = e1.getHigherImpactExperiment(e1, e2);
        ExperimentInfo highExp = (ExperimentInfo) higher;

        System.out.println("Higher Impact Experiment:");
        System.out.println(highExp.getExperimentTitle());
    }
}
