import java.util.Arrays;

public class RemoveDupicateTest1 {

    public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];

        for(int i=0;i<j;i++) {
            System.out.print(temp[i] + " ");
        }
        // Changing the original array
//        for (int i = 0; i < j; i++) {
//            a[i] = temp[i];
//        }

        return j;
    }
    public static void main(String[] args)
    {
        int a[] = {10,20,20,30,30,30,40,50,50,50,50,50};
        int n = a.length;

        n = removeduplicates(a, n);

        // Printing The array elements
//        for (int i = 0; i < n; i++)
//            System.out.print(a[i] + " ");
    }
}