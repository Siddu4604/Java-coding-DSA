import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayInPlace {
    public static void reverseGivenArrayInPlace(int[] arr) {
        IntStream.range(0, arr.length / 2).forEach(i -> {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        });
        System.out.println("Reversed array is: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseGivenArrayInPlace(arr);
    }
}
