import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingThirdVariable {
    public static void main(String[] args) {
        System.out.println("enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Numbers entered are: " + "a= " + a + " ,b= " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Numbers after swapping are: " + "a= " + a + " ,b= " + b);
        sc.close();

    }
}
