import java.util.Arrays;

class Call {
    private void init() {
        System.out.println("Initialized");
    }

    public void start() {
        init();
        int value = 100;
        System.out.println("Started");
        int i = 10;
        value /= i;
        System.out.println(value);

        int arr[] = {10,20,30,40,50, 053};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr instanceof Object);
    }
}

public class TestCall {
    public static void main(String ... args) {
        Call c1 = new Call();
        c1.start();
        TestCall t1 = new TestCall();
        t1.amethod();
    }

    public void amethod() {
       int arr[][] = new int[3][];
       arr[1] = new int[]{1,2,3};
       arr[2] = new int[]{4,5};
       System.out.println(arr[1][1]); //should be 2
    }
}
