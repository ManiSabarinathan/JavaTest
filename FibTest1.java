public class FibTest1 {
    static int n=5;
    int arr[] = new int[n];

    public static void main(String ... arg) {
        FibTest1 ob = new FibTest1();
        ob.fib(n);
    }
    public int fib(int n) {
        if(n ==0) return 0;
        if(n ==1) return 1;
//        if(arr[n]!=0) {
//            return arr[n];
//        }
        arr[n]=fib(n-1)+fib(n-2);
        return arr[n];
    }
}
