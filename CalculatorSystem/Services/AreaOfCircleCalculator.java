package Services;

import Entities.CircleData;
import Interfaces.CalculatorInterface;

import java.util.Scanner;

public class AreaOfCircleCalculator  implements CalculatorInterface {


    @Override
    public void calculate() {
        Scanner s=new Scanner(System.in);
        CircleData circleData=new CircleData();
        System.out.println("Formula: (A = πr²)");

        System.out.println("Enter radius (r):");
        circleData.setRadius(s.nextDouble());

        double findAreaCircle=(Math.PI*Math.pow(circleData.getRadius(),2));
        System.out.println("The area of the circle is: " + findAreaCircle);

    }
}
