public class FibSimpleRecursive {
    static int n1 = 0;
    static int n2 = 1;
    static int n3;
    public static void main(String ... args) {
        int counter = 5;
        System.out.print(n1 + " " + n2);
        FibSimpleRecursive obj = new FibSimpleRecursive();
        obj.fib(counter);
    }
//Recursive way to solve
    public void fib(int counter) {
        if(counter>0) {
            n3 = n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" " + n3);
            fib(--counter);
        }
    }
}
