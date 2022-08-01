public class StringReverseTest {
    public static void main(String ... args) {
        String str = "sabari";
        char cArr[] = new char[str.length()];
        cArr = str.toCharArray();
        String revereString="";
        for(int i=cArr.length-1;i>=0;i--){
            revereString+=cArr[i];
        }
        System.out.println("Reverse String :: " + revereString);
    }
}
