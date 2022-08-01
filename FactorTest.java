public class FactorTest {
    public static void main(String ... args) {
        int arr[] = {24,36};
        for(int i=0;i<arr.length;i++) {
            //find factor of 24
            //array in ascending order, hence arr[0] will be smallest number
            int limit=arr[0];

            System.out.println();
            System.out.println("Factor of " + arr[i]);
            for(int j =1;j<=limit;j++) {
                //find modulus
                if(arr[i]%j==0){
                        System.out.print(" " + j + " ");
                }
            }
        }
    }
}
