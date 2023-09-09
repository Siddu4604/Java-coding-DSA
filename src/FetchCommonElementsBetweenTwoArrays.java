import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FetchCommonElementsBetweenTwoArrays {

    public static void fetchCommonElements(int[] array1, int[] array2){
        List<Integer> commonElements= Arrays.stream(array1).filter(number->Arrays.stream(array2)
                .anyMatch(arr2number->arr2number==number)).boxed().collect(Collectors.toList());
        System.out.println("common elements are: "+commonElements);
    }
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2={1,4,5,6,7};
        fetchCommonElements(array1,array2);
    }
}
