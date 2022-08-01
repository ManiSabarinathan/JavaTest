public class FibDynamic {
    static  int max = 9;
    static int[] fib = new int[max+1];

    int fibonacci(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;

        if (fib[num] != 0) {
            return fib[num];
        }
        fib[num] = fibonacci(num - 1) + fibonacci(num - 2);
        return fib[num];
    }

    public static void main(String ... args) {
        FibDynamic ob = new FibDynamic();
        System.out.println(ob.fibonacci(max));
    }
}
