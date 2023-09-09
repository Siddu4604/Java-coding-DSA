import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbersFromTheList {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        input.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        List<Integer> output=input.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("even numbers from the list: "+output);
    }
}




