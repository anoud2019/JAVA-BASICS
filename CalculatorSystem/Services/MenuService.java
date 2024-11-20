package Services;

import java.util.Scanner;

public class MenuService {
    static Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        boolean running = true;

        while (running) {

            System.out.println("---Calculator System----");
            System.out.println("Select an Option:");
            System.out.println("1. Final Velocity :");
            System.out.println("2. Displacement :");
            System.out.println("3. Final Velocity Squared:");
            System.out.println("4. Area of a Circle:");
            System.out.println("5. Simple Interest:");
            System.out.println("6. Force:");
            System.out.println("7. Density:");
            System.out.println("8. Compound Interest:");
            System.out.println("9. Exit");
            System.out.println("-------------------------------------------------");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Final Velocity
                    FinalVelocityCalculator finalVelocityCalculator = new FinalVelocityCalculator();
                    finalVelocityCalculator.calculate();
                    break;

                case 2:
                    // Displacement
                    DisplacementCalculator displacementCalculator = new DisplacementCalculator();
                    displacementCalculator.calculate();
                    break;

                case 3:
                    // Final Velocity Squared
                    FinalVelocitySquaredCalculator finalVelocitySquaredCalculator = new FinalVelocitySquaredCalculator();
                    finalVelocitySquaredCalculator.calculate();
                    break;

                case 4:
                    // Area of a Circle
                    AreaOfCircleCalculator areaOfCircleCalculator = new AreaOfCircleCalculator();
                    areaOfCircleCalculator.calculate();
                    break;

                case 5:
                    // Simple Interest
                    SimpleInterestCalculator simpleInterestCalculator = new SimpleInterestCalculator();
                    simpleInterestCalculator.calculate();
                    break;

                case 6:
                    // Force
                    ForceCalculator forceCalculator = new ForceCalculator();
                    forceCalculator.calculate();
                    break;

                case 7:
                    // Density
                    DensityCalculator densityCalculator = new DensityCalculator();
                    densityCalculator.calculate();
                    break;

                case 8:
                    // Compound Interest
                    CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
                    compoundInterestCalculator.calculate();
                    break;

                case 9:
                    System.out.println("Exit of system");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option selected");
            }

            System.out.println("-------------------------------------------------");
        }

        scanner.close();
    }
}
