package practice;

import java.util.Scanner;

public class Ps103 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of arrays: ");
        int numArrays = scanner.nextInt();
        
        for (int i = 1; i <= numArrays; i++) {
            System.out.print("Enter the number of elements in array " + i + ": ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            
            System.out.println("Enter the elements of array " + i + ":");
            for (int j = 0; j < size; j++) {
                array[j] = scanner.nextInt();
            }
            
            System.out.print("Enter the element to search in array " + i + ": ");
            int target = scanner.nextInt();
            
            int index = linearSearch(array, target);
            if (index != -1) {
                System.out.println("Element " + target + " found at index " + index + " in array " + i);
            } else {
                System.out.println("Element " + target + " not found in array " + i);
            }
        }
        
        scanner.close();
    }
 
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
