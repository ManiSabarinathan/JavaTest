public class PoliTest {
    public static void main(String ... args) {
        String str = "MALAYALAmm";
        isPoli(str);
    }

    private static void isPoli(String str) {
        char[] cArr = str.toCharArray();
        String reverseString = reverse(cArr);
        System.out.println("Reverse String :: "+ reverseString);
        if(str.equalsIgnoreCase(reverseString)){
            System.out.println("Yes Poli");
        } else  {
            System.out.println("No Poli");
        }
    }

    private static String reverse(char[] cArr){
        String str = new String();
        for(int i=cArr.length-1;i>=0;i--){
            str = str+ cArr[i];
        }
        return str;
    }
}
