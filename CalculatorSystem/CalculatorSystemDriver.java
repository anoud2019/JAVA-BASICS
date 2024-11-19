import Entities.*;
import Services.*;

import java.util.Scanner;

public class CalculatorSystemDriver {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        boolean running=true;

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
            int choice = s.nextInt();
            switch (choice) {

                case 1:
                    //Final Velocity
                    MotionData finalVelocity = new MotionData();
                    FinalVelocityCalculator finalVelocityCalculator = new FinalVelocityCalculator(finalVelocity);
                    finalVelocityCalculator.calculate();
                    break;

                case 2:
                    // Displacement
                    MotionData displacement = new MotionData();
                    DisplacementCalculator displacementCalculator=new DisplacementCalculator(displacement);
                    displacementCalculator.calculate();
                    break;

                case 3:
                    //Final Velocity Squared
                    MotionData velocitySquared=new MotionData();
                    FinalVelocitySquaredCalculator finalVelocitySquaredCalculator=new FinalVelocitySquaredCalculator(velocitySquared);
                    finalVelocitySquaredCalculator.calculate();
                    break;

                case 4:
                    //Area of a Circle
                    CircleData circleData=new CircleData();
                    AreaOfCircleCalculator areaOfCircleCalculator=new AreaOfCircleCalculator(circleData);
                    areaOfCircleCalculator.calculate();
                    break;

                case 5:
                    //Simple Interest
                    InterestData interestData=new InterestData();
                    SimpleInterestCalculator simpleInterestCalculator=new SimpleInterestCalculator(interestData);
                    simpleInterestCalculator.calculate();
                    break;

                case 6:
                    //Force
                    PhysicsData physicsData=new PhysicsData();
                    ForceCalculator forceCalculator=new ForceCalculator(physicsData);
                    forceCalculator.calculate();
                    break;


                case 7:
                    //Density
                    PhysicsData density=new PhysicsData();
                    DensityCalculator densityCalculator=new DensityCalculator(density);
                    densityCalculator.calculate();
                    break;


                case 8:
                    //Compound Interest
                    InterestData interestData1=new InterestData();
                    CompoundInterestCalculator compoundInterestCalculator=new CompoundInterestCalculator(interestData1);
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
        s.close();

    }
}
