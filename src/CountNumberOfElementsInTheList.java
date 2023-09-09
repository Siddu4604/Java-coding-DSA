import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class CountNumberOfElementsInTheList {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Long count = input.stream().count();
        System.out.println(count);
    }


}
