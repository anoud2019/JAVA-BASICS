package Services;

import Entities.BaseData;
import Entities.MotionData;
import Interfaces.CalculatorInterface;

import java.util.Scanner;
import java.util.UUID;

public class FinalVelocityCalculator implements CalculatorInterface {


    @Override
    public void calculate() {
        Scanner s = new Scanner(System.in);
        MotionData motionData=new MotionData();
        System.out.println("Enter ID:");
        motionData.setId(s.nextInt());
        s.nextLine();
        System.out.println("Enter Description:");
        motionData.setDescription(s.nextLine());


        System.out.println("Formula: v = u + at");
        System.out.print("Enter initial velocity (u): ");
        motionData.setInitialVelocity(s.nextDouble());
        System.out.print("Enter acceleration (a): ");
        motionData.setAcceleration(s.nextDouble());
        System.out.print("Enter time (t): ");
        motionData.setTime(s.nextDouble());


        double finalVelocity = motionData.getInitialVelocity() +
                (motionData.getAcceleration() * motionData.getTime());

        System.out.println("ID: " + motionData.getId());
        System.out.println("Description: " + motionData.getDescription());

        System.out.println( "The final velocity (v) is: " + finalVelocity);
    }
}
