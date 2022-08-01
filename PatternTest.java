import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String... args) {
        String[] IP = new String[]{
//                "12.12.12.12",
//                "13.13.13.112",
//                "VUUT.12.12",
//                "111.111.11.111",
//                "1.1.1.1.1.1.1",
//                "....",
//                "...1..1..1",
//                "0.0.0.0",
//                "255.0.255.0",
//                "266.266.266.266",
//                "00000.000000.0000000.00001",
//                "0023.0012.0012.0034"
                "123.112.123.244"
                //"240"

        };
        String patternStr  = "(0?[0-9]{1,2}|1?[0-9]{1,2}|2[0-4][0-9]|25[0-5]).(0?[0-9]{1,2}|1?[0-9]{1,2}|2[0-4][0-9]|25[0-5]).(0?[0-9]{1,2}|1?[0-9]{1,2}|2[0-4][0-9]|25[0-5]).(0?[0-9]{1,2}|1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
        //String copyPattern = "(0?[0-9]{1,2}|1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
//        String anotherPattern = "\\b(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\b";

//        String patternStr_200 = "2[0-4][0-9]|25[0-5]";
//        String patternStr_100 = "1?[0-9]{1,2}";
//        String patternStr_0_100 = "0?[0-9]{1,2}";


        for(int i=0;i<IP.length;i++) {
            boolean isPatternMatches = Pattern.matches(patternStr, IP[i]);
//            Pattern.compile( )
            System.out.println(isPatternMatches);
        }

    }
}



