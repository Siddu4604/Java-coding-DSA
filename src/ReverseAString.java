import java.util.Scanner;

public class ReverseAString {
    public static String reverseOfString(String input)
    {
        char[] chars=input.toCharArray();
        int start=0;
        int end=chars.length-1;
        while (start<end)
        {
            char temp=chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String input=sc.nextLine();
        String reversed=reverseOfString(input);
        System.out.println("reversed string is: "+reversed);
    }
}
