package Services;

import Entities.PhysicsData;
import Interfaces.CalculatorInterface;

import java.util.Scanner;

public class ForceCalculator implements CalculatorInterface {
    private PhysicsData physicsData;

    public ForceCalculator(PhysicsData physicsData) {
        this.physicsData = physicsData;
    }

    @Override
    public void calculate() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Formula: (F = ma)");
        System.out.println("Enter Mass (m):");
        physicsData.setMass(scanner.nextDouble());
        System.out.println("Enter Acceleration (a):");
        physicsData.setAcceleration(scanner.nextDouble());

        double findForce=physicsData.getMass()*physicsData.getAcceleration();
        System.out.println("The Force (F):"+findForce);
    }
}