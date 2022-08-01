public class SumTest {
    public static void main(String ... args) {
        int arr[] = {3,2,3};
        int target=6;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                //System.out.print(" "+ arr[j] + " ");
                if(arr[i]+ arr[j]==target) {
                    System.out.println("Target index is :: "+ i + " and " + j);
                }
            }
            System.out.println();
        }
    }
}
