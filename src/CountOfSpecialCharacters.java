import java.util.Scanner;

public class CountOfSpecialCharacters {
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        StringBuilder specialCharactersRemoved= new StringBuilder();
        StringBuilder specialCharacters=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
                count++;
                specialCharacters.append(s.charAt(i));
            }
            else specialCharactersRemoved.append(s.charAt(i));
        }

        if (count == 0) {
            System.out.println("No Special characters found");
        } else System.out.println("Number of special characters found is:" +" "+ count);
        System.out.println("String without special characters is:"+specialCharactersRemoved);
        System.out.println("special characters are:"+specialCharacters);

    }
}
