import java.util.Arrays;
import java.util.List;

public class SortAListOfNumbersIntoAscendingOrderUsingLambdaExpressions {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 3, 2, 4);
        numbers.sort((a, b) -> a - b);
        System.out.println(numbers);
    }

}
