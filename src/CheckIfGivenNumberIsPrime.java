//notes
//notes
import java.util.Scanner;

public class CheckIfGivenNumberIsPrime {
    public static boolean isPrime(int number)
    {
        if (number<2)
        {
            return false;
        }
        else
        {
            for (int i=2;i<=Math.sqrt(number);i++)
            {
                if (number%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner sc=new Scanner(System.in);
        int numberToCheck=sc.nextInt();
        if(isPrime(numberToCheck))
        {
            System.out.println("prime number");
        }
        else System.out.println("not prime number");

    }
}
