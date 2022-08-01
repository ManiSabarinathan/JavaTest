public class xorSumTest {
    public static void main(String ... args) {
        xorSumTest obj = new xorSumTest();
        obj.getXor(2,8);
    }

    private void getXor(int l, int h) {
        int sum = 0;
        for(int i=l;i<h;i++) {
            int xorValue = xor(i, i+1);
            System.out.println("==> " + i + "===> "+ (i+1) + "==> "+ xorValue);
            sum+=xorValue;
        }
    }

    private int xor(int num1, int num2) {
        return num1 ^ num2;
    }
}
