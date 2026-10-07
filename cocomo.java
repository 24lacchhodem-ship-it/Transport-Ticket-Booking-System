import java.util.Scanner;

public class COCOMO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("  TRANSPORT TICKET BOOKING SYSTEM");
        System.out.println("       COCOMO COST ESTIMATION");
        System.out.println("======================================");

        System.out.print("Enter project size (KLOC): ");
        double kloc = sc.nextDouble();

        System.out.print("Enter cost per person-month (₹): ");
        double costPerMonth = sc.nextDouble();

        // Basic COCOMO - Organic Model
        double effort = 2.4 * Math.pow(kloc, 1.05);

        double developmentTime = 2.5 * Math.pow(effort, 0.38);

        double averageStaff = effort / developmentTime;

        double totalCost = effort * costPerMonth;

        System.out.println("\n----------- RESULTS -----------");
        System.out.printf("Project Size          : %.2f KLOC%n", kloc);
        System.out.printf("Effort                : %.2f Person-Months%n", effort);
        System.out.printf("Development Time      : %.2f Months%n", developmentTime);
        System.out.printf("Average Staff         : %.2f Persons%n", averageStaff);
        System.out.printf("Total Development Cost: ₹%.2f%n", totalCost);

        sc.close();
    }
}
