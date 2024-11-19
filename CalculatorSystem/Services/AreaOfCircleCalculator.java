package Services;

import Entities.CircleData;
import Interfaces.CalculatorInterface;

import java.util.Scanner;

public class AreaOfCircleCalculator  implements CalculatorInterface {
    private CircleData circleData;

    public AreaOfCircleCalculator(CircleData circleData) {
        this.circleData = circleData;
    }

    @Override
    public void calculate() {
        Scanner s=new Scanner(System.in);
        System.out.println("Formula: (A = πr²)");

        System.out.println("Enter radius (r):");
        circleData.setRadius(s.nextFloat());

        double findAreaCircle=(Math.PI*Math.pow(circleData.getRadius(),2));
        System.out.println("The area of the circle is: " + findAreaCircle);

    }
}
