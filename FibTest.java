public class FibTest {
    public static void main(String ... args) {
        FibTest obj = new FibTest();
        obj.fib(8);
        System.out.println(fib2(7));
    }

    private void fib(int n) {
        int f0 = 0;
        int f1 = 1;
        System.out.println( f0 );
        System.out.println( f1 );

        for(int i=0;i<n-2;i++){
            int temp = f0+f1;
            System.out.println(temp);
            f0 = f1;
            f1 = temp;
        }
    }

    static int fib2(int n)
    {
//        System.out.println("==> "+ n);
        if (n <= 1)
            return n;
        return fib2(n-1) + fib2(n-2);
    }
}
