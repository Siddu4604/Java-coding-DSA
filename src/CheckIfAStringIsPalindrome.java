import java.util.Scanner;

public class CheckIfAStringIsPalindrome {
    public static boolean isPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
//notes
    public static void main(String[] args) {
        System.out.println("enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (isPalindrome(input)) {
            System.out.println(input + " is" + " palindrome");
        } else {
            System.out.println(input + " is" + " not palindrome");
        }
    }
}
