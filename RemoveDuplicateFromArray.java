import java.sql.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateFromArray {

    public static void main(String... args) {
        Integer arr[] = new Integer[]{0, 0, 1, 1, 1, 1, 3, 4, 9};
//        int iArr[] = new int[]{10, 15, 15, 25, 25, 55};
        int iArr[] = new int[]{1,1,2};

        // removeDuplicateBySet(arr);
        // removeDuplicateOfPrimitive(iArr);
        //removeDuplicateFromArrayWithAdditionalArray(iArr);
        //removeDuplicateFromTheSameArray(iArr);
        removeDuplicateFromTheSameArrayLeet(iArr);
    }

    private static void removeDuplicate(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length) break;
            ;
            if (arr[i] == arr[i + 1]) {
                continue;
            }
        }
        return;
    }

    private static void removeDuplicateBySet(Integer[] arr) {
        Set<Integer> uniqueNumbers = Stream.of(arr).collect(Collectors.toSet());
        System.out.println("Unique Numbers:: " + uniqueNumbers);
    }


    private static void removeDuplicateOfPrimitive(int[] arr) {
        Set<Integer> uniqueNumbersByBoxed = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        System.out.println("Boxed uniqueNumber :: " + uniqueNumbersByBoxed);
        System.out.println("Boxed uniqueNumber SIZE :: " + uniqueNumbersByBoxed.size());

    }

    private static void removeDuplicateFromArrayWithAdditionalArray(int[] arr) {
        int j = 0;
        int tempArr[] = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                tempArr[j] = arr[i];
                j++;
            }
        }
        tempArr[j] = arr[arr.length - 1];
        System.out.println("Additional Array :: " + Arrays.toString(tempArr));
    }

    //Validate again
    private static void removeDuplicateFromTheSameArray(int[] arr) {

        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[arr.length - 1];
        System.out.println("Same Array :: " + Arrays.toString(arr));
        System.out.println("Same Array unique size:: " + j);


    }


    private static void removeDuplicateFromTheSameArrayLeet(int[] arr) {
        int j= 0;
        for(int i =1;i<arr.length;i++){
            if(arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        System.out.println("Leet Array size :: " + (j+1));

    }
}