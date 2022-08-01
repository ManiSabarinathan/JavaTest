public class FibSimple {
    public static void main(String ... args) {
        //Iterative way to solve
        int max = 10;
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2);
        for(int i=0;i<max;i++) {
            //print only sum here
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1=n2;
            n2=n3;
        }
    }
}
