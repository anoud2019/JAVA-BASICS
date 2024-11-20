package Services;

import Entities.MotionData;
import Interfaces.CalculatorInterface;

import java.util.Scanner;

public class DisplacementCalculator implements CalculatorInterface {

    @Override
    public void calculate() {
        Scanner scanner=new Scanner(System.in);
        MotionData motionData=new MotionData();
        System.out.println("Formula: (s = ut + ½at²)");

        System.out.println("Enter initialVelocity (u):");
        motionData.setInitialVelocity(scanner.nextDouble());
        System.out.println("Enter Time (t):");
        motionData.setTime(scanner.nextDouble());
        System.out.println("Enter acceleration (a):");
        motionData.setAcceleration(scanner.nextDouble());

        double findDisplacement = (motionData.getInitialVelocity()* motionData.getTime()) + (0.5 * motionData.getAcceleration() * Math.pow(motionData.getTime(), 2));
        System.out.println("The Displacement (s) is:" + " " + findDisplacement);
    }
}
