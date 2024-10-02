import java.util.Scanner;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // Call the fix34 method to rearrange the array
        arr = fix34(arr);
        // Print the modified array after rearranging
        System.out.println("The rearranged array is: ");
        for(int a: arr){
            System.out.print(a + " ");// Print each element in the array
        }

    }
    public static int[] fix34(int[] arr){
        // Loop through the array to find each 3
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==3){// If current element is 3
                // Loop to find the nearest 4 after the current 3
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j]==4){ // If current element is 4
                        // Swap the element after 3 with the found 4
                        int temp = arr[i+1];
                        arr[i+1] = 4;
                        arr[j] = temp;
                        break;// Exit the inner loop after swapping
                    }
                }
            }

        }
        return arr;// Return the modified array
    }

}
