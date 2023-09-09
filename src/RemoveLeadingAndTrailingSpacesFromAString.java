import java.util.Scanner;

public class RemoveLeadingAndTrailingSpacesFromAString {

    public static String removeLeadingAndTrailingSpaces(String s) {
        return s.trim();
    }

    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeLeadingAndTrailingSpaces(s));
    }


}


