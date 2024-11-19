package Services;

import Entities.PhysicsData;
import Interfaces.CalculatorInterface;

import java.util.Scanner;

public class DensityCalculator implements CalculatorInterface {
    private PhysicsData physicsData;

    public DensityCalculator(PhysicsData physicsData) {
        this.physicsData = physicsData;
    }

    @Override
    public void calculate() {
        Scanner s = new Scanner(System.in);
        System.out.println("Formula: Density = Mass ÷ Volume");

        System.out.print("Enter mass : ");
        physicsData.setMass(s.nextDouble());
        System.out.print("Enter volume : ");
        double volume = s.nextDouble();

        double density = physicsData.getMass() / volume;

        System.out.println("The density is: " + density );
    }

}
