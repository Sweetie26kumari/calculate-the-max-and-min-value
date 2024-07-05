import java.util.Scanner;  

// This class will calculate the max and min values of the array  
class TestArray {  
    int MAX(int[] Arry) {  
        int maxValue = Arry[0];  

        for (int i = 1; i < Arry.length; i++) {  
            if (Arry[i] > maxValue) {  
                maxValue = Arry[i];  
            }  
        }  
        return maxValue; // This method will return the max value present in the array.  
    }  

    int MIN(int[] Arry) {  
        int minValue = Arry[0];  

        for (int i = 1; i < Arry.length; i++) {  
            if (Arry[i] < minValue) {  
                minValue = Arry[i];  
            }  
        }  
        return minValue;  
    }  
}  

public class DifferenceArry {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        
        // Prompt user to enter the number of array elements
        System.out.print("Enter the number of array elements: ");  
        int n = sc.nextInt();  

        // Initialize the array
        int[] arr = new int[n];  

        // Prompt user to enter each element of the array
        for (int i = 0; i < arr.length; i++) {  
            System.out.print("Enter [" + (i + 1) + "] element: ");  
            arr[i] = sc.nextInt();  
        }  

        // Create an object of TestArray to use its methods
        TestArray obj = new TestArray();  
        
        // Calculate and display the maximum value in the array
        int max = obj.MAX(arr);
        System.out.println("Maximum value in the array is: " + max);  
        
        // Calculate and display the minimum value in the array
        int min = obj.MIN(arr);
        System.out.println("Minimum value in the array is: " + min);  
        
        // Calculate and display the difference between max and min values
        int diff = max - min;  
        System.out.println("Difference between max and min elements is: " + diff);     
    }  
}