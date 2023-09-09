import java.util.Scanner;

public class CodeToTakeUserArrayInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter elements of array");
        for (int i=0;i<size;i++)
        {
            System.out.print("element"+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        System.out.println("\nArray elements");
        for (int element:arr)
        {
            System.out.print(element+" ");
        }
    }
}
