import java.util.stream.IntStream;

public class BuildStringTillTheRange {
    public static void main(String... args) {
        String input = "a";
        int maxLimit = 10;
        BuildStringTillTheRange obj = new BuildStringTillTheRange();
        System.out.println("=======> " + obj.amethod(input, maxLimit));
    }

    private int amethod(String input, int maxLimit) {
        int inputSize = input.length();
        System.out.println("inputSize :: "+ inputSize);
        System.out.println("maxLimit :: "+ maxLimit);

        int maxCopy = maxLimit / inputSize;
        int balanceValue = maxLimit % inputSize;
        System.out.println("maxCopy :: "+ maxCopy);

        int finalValue = maxCopy*occuranceOfA(input) + occuranceOfA(input.substring(0,balanceValue));

        return finalValue;
    }

    public static long repeatedString(String s, long n) {
        // Write your code here
        long maxCopySize = n / s.length();
        long balanceValue = n % s.length();
        long returnValue = maxCopySize * count(s);
        String balanceString = s.substring(0, (int)balanceValue);
        // count(s.substring(0,balanceValue));
        return returnValue;
    }

    public static long count(String str) {
        final char[] cArr = str.toCharArray();
        long count = 0;
        for(int i = 0;i<cArr.length;i++) {
            if(cArr[i] == 'a'){
                count++;
            }
        }
        return count;
    }


    private int occuranceOfA(String str) {
        int count = 0;
        char[] cArr = str.toCharArray();
        for(int i=0;i<cArr.length;i++){
            if(cArr[i]=='a') {
                count++;
            }
        }
        return count;
    }
}