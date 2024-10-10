
import java.util.*;

class UniqueElementFinder
{
    // This function prints all distinct elements from the given array
  public static void findUniqueElements(int arr[]){
        // Creates an empty HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Traverse the input array
        for (int i = 0; i < arr.length; i++){
            // If the element is not already in the HashSet, add it to the set and print it
            if (!set.contains(arr[i]))
            {
                set.add(arr[i]); // Add the element to the HashSet
                System.out.print(arr[i] + " "); // Print the distinct element
            }
        }
    }

    // Main method to test the above method
    public static void main (String[] args)
    {
        // Define an array of integers with some duplicate elements
        int arr[] = {10, 5, 3, 4, 3, 5, 6};

        // Call the method to print unique elements of the array
        findUniqueElements(arr);
    }
}
