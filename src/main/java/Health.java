import java.util.Scanner;

public class Health {
    // here is the main menu which will give the user to navigate through the different options based on number input
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=====================================");
        System.out.println("        H&F: HEALTH & FITNESS");
        System.out.println("=====================================");
        System.out.println("  1. Calorie Calculator");
        System.out.println("  2. Diet Planner");
        System.out.println("  3. About");
        System.out.println("  4. Exit");
        System.out.println("-------------------------------------");
        System.out.print("Choose an option (1-4): ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Welcome to the Calorie Calculator");

        } else if (choice == 2) {
            System.out.println("Welcome to the Diet Planner");


        } else if (choice == 3) {
            System.out.println("H&F: Health & Fitness");
            System.out.println("This program helps you manage your");
            System.out.println("calorie intake and plan your diet.");
            System.out.println("It will take in details about you");
            System.out.println("Such as: age, gender, habits. To personalise to you.");

        }
    }
}

