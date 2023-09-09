import java.util.Scanner;

public class RemoveSpacesFromAString {
    public static String removeSpaces(String s) {
        return s.replaceAll(" ", "");
    }

    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeSpaces(s));
    }
}
