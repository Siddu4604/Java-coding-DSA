import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
//        int[] array = {1, 10, 3, 2, 6, 4, 7};
        System.out.print("enter size of array: ");
        Scanner sc = new Scanner((System.in));
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("enter elements of array");
        for (int i = 0; i < size; i++) {
            System.out.print("element " + (i + 1) + " is: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Entered array elements are: ");
        for (int element : array) {
            System.out.println(element + " ");
        }
        Arrays.sort(array);
        System.out.println("Sorted array is: " + Arrays.toString(array));
       /* System.out.println("Sorted array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }*/


    }
}
