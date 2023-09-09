import java.util.Arrays;

public class DeletingAnElementFromAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int elementToBeDeleted=3;
        System.out.println("Original Array is: "+ Arrays.toString(arr));


        int indexOfTheElement=-1;
        for (int i=0;i<arr.length-1;i++)
        {
            if (arr[i]==elementToBeDeleted)
            {
                indexOfTheElement=i;
                break;
            }
        }

        if (indexOfTheElement==-1)
        {
            System.out.println("element not found");
            return;
        }
        for (int i=indexOfTheElement;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }

        int[] newArr=Arrays.copyOf(arr,arr.length-1);
        System.out.println("New array after deleting an element is: "+Arrays.toString(newArr));



    }
}
