import java.util.Arrays;

public class FetchSecondSmallestElementInArray {

    public static void fetchSecondSmallestElement(int[] array) {
        int secondSmallestElement = Arrays.stream(array).distinct().sorted()
                .skip(1).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("array doesn't contain second element "));
        System.out.println("second smallest element is: " + secondSmallestElement);
    }

    public static void main(String[] args) {
        int[] array = new int[]{1};
        fetchSecondSmallestElement(array);
    }

}


