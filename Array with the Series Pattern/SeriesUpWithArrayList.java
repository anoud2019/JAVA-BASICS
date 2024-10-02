import java.util.ArrayList;
import java.util.Scanner;

public class SeriesUpWithArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        // Call the seriesUp method and store the result
        ArrayList<Integer> result= seriesUp(n);
        // Print the resulting ArrayList
        System.out.println("The series up to "+n+" is: ");
        for (int number: result){
            System.out.print(number+" ");
        }
    }
    public static ArrayList<Integer> seriesUp(int n){
        ArrayList<Integer> result= new ArrayList<>();
        // Loop from 1 to n
        for (int i=1;i<=n;i++){// Outer loop for groups 1, 2, ..., n
            // Inner loop to fill the current group i
            for(int j=1;j<=i;j++){
                result.add(j);// Add the current number to the ArrayList
            }
        }
        return result;// Return the populated ArrayList
    }

}
