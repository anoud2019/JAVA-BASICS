package Services;

import Entities.InterestData;
import Interfaces.CalculatorInterface;

import java.util.Scanner;

public class SimpleInterestCalculator implements CalculatorInterface {
    private InterestData interestData;

    public SimpleInterestCalculator(InterestData interestData) {
        this.interestData = interestData;
    }

    @Override
    public void calculate() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Formula:(SI = P × R × T ÷ 100)");
        System.out.println("Enter principal(P):");
        interestData.setPrincipal(scanner.nextDouble());
        System.out.println("Enter rate (R):");
        interestData.setRate(scanner.nextDouble());
        System.out.println("Enter time (T):");
        interestData.setTime(scanner.nextDouble());

        double findInterest= (interestData.getPrincipal()* interestData.getRate()* interestData.getTime())/100;
        System.out.println("The Simple Interest (SI) is: " + findInterest);
    }
}
