package Services;

import Entities.MotionData;

import java.util.Scanner;

public class CalculatorSystemDriver {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("---Calculator System----");
        System.out.println("Select an Option:");
        System.out.println("1. Final Velocity :");
        System.out.println("2. Displacement :");
        System.out.println("3. Final Velocity Squared");
        System.out.println("4. Area of a Circle");
        System.out.println("5. Simple Interest");
        System.out.println("6. Force");
        System.out.println("7. Density");
        System.out.println("8. Compound Interest");
        System.out.println("9. Exit");
        System.out.println("-------------------------------------------------");
        int choice= s.nextInt();
        switch (choice){
            case 1:
                MotionData motionData =new MotionData();
                System.out.println("Formula: (v = u + at)");
                System.out.println("Enter initialVelocity (u): ");
                motionData.setInitialVelocity(s.nextDouble());
                System.out.println("Enter acceleration (a):");
                motionData.setAcceleration(s.nextDouble());
                System.out.println("Enter Time (t):");
                motionData.setTime(s.nextDouble());
                double finalValue= motionData.getInitialVelocity()+motionData.getAcceleration() * (motionData.getTime());
                System.out.println("The Final Velocity (v) is:" +" "+ finalValue );
                break;

            case 2:
                MotionData motionData1=new MotionData();
                System.out.println("Formula: (s = ut + ½at²)");
                System.out.println("Enter initialVelocity (u):");
                motionData1.setInitialVelocity(s.nextDouble());
                System.out.println("Enter Time (t):");
                motionData1.setTime(s.nextDouble());
                System.out.println("Enter acceleration (a):");
                motionData1.setAcceleration(s.nextDouble());
                double findDisplacement= (motionData1.getInitialVelocity() * motionData1.getTime()) + (0.5 * motionData1.getAcceleration() *Math.pow(motionData1.getTime(),2));
                System.out.println("The Displacement (s) is:"+" "+findDisplacement);
            case 3:

            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid option selected");

        }
        s.close();



    }
}
