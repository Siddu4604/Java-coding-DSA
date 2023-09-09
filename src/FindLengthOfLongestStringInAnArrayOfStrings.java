import java.util.Arrays;

public class FindLengthOfLongestStringInAnArrayOfStrings {
    public static void main(String[] args) {
        String[] strings = {"Apple", "Banana", "Avocado", "Apricot", "Grapes"};
        fetchLengthOfLongestString(strings);
    }

    public static void fetchLengthOfLongestString(String[] strings) {
        int maxLength = Arrays.stream(strings).mapToInt(string -> string.length()).max().orElse(0);


        System.out.println("length of longest string is: " + maxLength);
    }
}
