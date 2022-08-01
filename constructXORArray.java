import java.util.Arrays;

public class constructXORArray {
    public static void main(String ... args) {
        int l=15;
        int r=20;
        int constructedArr[]= constructXOR(l, r);
        getXORS(constructedArr, l,r);
    }

    private static void getXORS(int[] cArr, int l, int r) {
        int initialXor=0;
        for(long i=l;i<=r;i++) {
            initialXor = xor(initialXor, cArr[(int)i]);
            System.out.println("=======> "+ initialXor);
        }
    }
    public static int[] constructXOR(int l, int r) {
        long ll= 10;

        int iArr[] = new int[r+1];
        for(int i=1;i<=r;i++){
            iArr[i] = xor(i, iArr[i-1]);
        }
        System.out.println(Arrays.toString(iArr));
        return iArr;
    }

    private static int xor(int num1, int num2) {
        return num1 ^ num2;
    }
}
