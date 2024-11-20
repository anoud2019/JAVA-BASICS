package Services;

import Entities.InterestData;
import Interfaces.CalculatorInterface;

import java.util.Scanner;

public class CompoundInterestCalculator implements CalculatorInterface {

    @Override
    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        InterestData interestData =new InterestData();

        System.out.println("Formula: (CI = P × (1 + R ÷ 100)^T - P)");


        System.out.println("Enter principal (P):");
        interestData.setPrincipal(scanner.nextDouble());

        System.out.println("Enter rate (R):");
        interestData.setRate(scanner.nextDouble());

        System.out.println("Enter time (T):");
        interestData.setTime(scanner.nextDouble());


        double findCompoundInterest = interestData.getPrincipal() *
                Math.pow((1 + interestData.getRate() / 100), interestData.getTime()) - interestData.getPrincipal();

        System.out.println("The Compound Interest (CI) is: " + findCompoundInterest);
    }
}
