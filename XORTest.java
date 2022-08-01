import sun.java2d.loops.XORComposite;

public class XORTest {
    public static void main(String ... args) {
        int startValue = 10;
        int endValue = 15;
        XORTest obj = new XORTest();
        obj.getPair(startValue, endValue);
    }

    private void getPair(int start, int end) {
       /*
       (10,10)
       (10,11)
       (10,12)
       (10,13)
       (10,14)
       (10,15)
       (11,11)
       (11,12)
       ....
       (14,14)
       (14,15)
       (15,15)

         * */

        for(int i=start;i<=end;i++) {
            for(int j=i;j<=end;j++) {
                    System.out.println(i + " " + j);
                    int xorValue = xor(i, j);


            }
        }

    }

    private int xor(int i, int j) {
        return i^j;
    }
}
