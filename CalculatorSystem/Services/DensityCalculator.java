package Services;

import Entities.PhysicsData;
import Interfaces.CalculatorInterface;

import java.util.Scanner;

public class DensityCalculator implements CalculatorInterface {

    // Takes mass and volume as input by user, calculates density, and displays the result.
    @Override
    public void calculate() {
        Scanner s = new Scanner(System.in);
        System.out.println("Formula: Density = Mass ÷ Volume");
        PhysicsData physicsData=new PhysicsData();
        System.out.print("Enter mass : ");
        physicsData.setMass(s.nextDouble());
        System.out.print("Enter volume : ");
        physicsData.setVolume(s.nextDouble());

        double density = physicsData.getMass() / physicsData.getVolume();

        System.out.println("The density is: " + density );
    }

}
