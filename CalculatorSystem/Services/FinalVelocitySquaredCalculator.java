package Services;

import Entities.MotionData;
import Interfaces.CalculatorInterface;

import java.util.Scanner;

public class FinalVelocitySquaredCalculator implements CalculatorInterface {
    private MotionData motionData;

    public FinalVelocitySquaredCalculator(MotionData motionData) {
        this.motionData = motionData;
    }

    @Override
    public void calculate() {
        Scanner s = new Scanner(System.in);
        System.out.println("Formula: v² = u² + 2as");

        System.out.print("Enter initial velocity (u) : ");
        motionData.setInitialVelocity(s.nextDouble());

        System.out.print("Enter acceleration (a) : ");
        motionData.setAcceleration(s.nextDouble());

        System.out.print("Enter displacement (s) : ");
        double displacement=s.nextDouble();

        double finalVelocitySquared = Math.pow(motionData.getInitialVelocity(), 2) +
                (2 * motionData.getAcceleration()*displacement );

        System.out.println("The final velocity squared (v²) is: " + finalVelocitySquared);
    }

    }
