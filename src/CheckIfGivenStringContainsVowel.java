import java.util.Scanner;

public class CheckIfGivenStringContainsVowel {
    public  static boolean stringHasVowel(String input)
    {
        String lowerCase=input.toLowerCase();
        char[] chars=lowerCase.toCharArray();
        String vowels="aeiou";
        for (char c:chars)
        {
            if (vowels.indexOf(c)!=-1)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("enter a string: ");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        boolean hasVowel=stringHasVowel(input);
        if (hasVowel)
        {
            System.out.println("the string contains atleast one vowel");
        }
        else System.out.println("the string doesn't contains vowel");
    }
}
