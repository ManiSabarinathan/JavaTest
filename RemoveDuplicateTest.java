import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateTest {
    public static void main(String ... args) {
        RemoveDuplicateTest obj = new RemoveDuplicateTest();
        int arr[] = new int[]{10,20,20,30,30,30,40,50,50,50,50,50,60};

        //obj.removeDuplicateInSortedArrayWithExtraSpace(arr);
        obj.removeDuplicate(arr);
       // obj.removeDuplicateUsingStream(arr);
        //obj.removeDuplicateUsingSet(arr);
    }

    public void removeDuplicateUsingSet(int arr[]) {
//        Set set = new HashSet();
//        for(int in:arr) {
//            set.add(in);
//        }
        Set<Integer> set1 = Arrays.stream(arr).mapToObj(Integer::valueOf).collect(Collectors.toSet());
        System.out.println(set1);

    }

    public void removeDuplicateInSortedArrayWithExtraSpace(int arr[]) {
        int resultArry[] = new int[arr.length];
        int j=0;
        //Traverse from 0 to n-1
        //Compare i element with i+1 element
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]!=arr[i+1]) {
                resultArry[j]=arr[i];
                j++;
            }
        }
        resultArry[j]=arr[arr.length-1];
        System.out.println("Original array :: "+ Arrays.toString(arr));
        System.out.println("Result array :: "+ Arrays.toString(resultArry));

        //Remove zero from the array
        int[] finalArray = Arrays.stream(resultArry).filter(in -> in!=0).toArray();
        System.out.println("Removed zero from List:: "+ Arrays.toString(finalArray));

    }

    public void removeDuplicate(int arr[]) {
     //Remove duplicate element without extra space
        //{10,20,20,30,30,30,40,50,50,50,50,50};

        //{10,20,20};
        //int arr[] = new int[]{10,20,20};
        int j=0;
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]!=arr[i+1]) {
                arr[j]=arr[i];
                j++;
            }
        }
        arr[j] = arr[arr.length-1];
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<j;i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public void removeDuplicateUsingStream(int[] arr) {
        arr = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(arr));
    }
}
