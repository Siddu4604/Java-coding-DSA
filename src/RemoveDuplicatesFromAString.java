import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromAString {
    public static String removeDuplicated(String input)
    {
        char[] chars=input.toCharArray();
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
        for (char c:chars)
        {
            uniqueChars.add(c);
        }
        StringBuilder result=new StringBuilder();
        for (Character c:uniqueChars)
        {
            result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String input=sc.nextLine();
        String output=removeDuplicated(input);
        System.out.println("original String is: "+input);
        System.out.println("String without duplicates is: "+output);
    }

}
