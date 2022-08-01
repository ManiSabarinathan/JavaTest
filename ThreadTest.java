import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest {

    public static void main(String ... args) {

        HashMap map = new HashMap();

//        AtomicInteger count = new AtomicInteger();
        int count = 0;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<8;i++) {
                    //System.out.println(count++);
                }
            }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();

    }
}
