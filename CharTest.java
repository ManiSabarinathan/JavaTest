import java.util.ArrayList;
import java.util.List;

public class CharTest {
    public static void main(String ... args) {
        CharTest test = new CharTest();
        String str="welcome";
        char cArr[] = str.toCharArray();
//        for(char c:cArr) {
//            System.out.print(c);
//        }

        List<Character> cList = new ArrayList<>();
        for(char c:cArr) {
            cList.add(c);
        }
        System.out.println(cList);
        String s = "";
        for(Character c:cList){
            s+=c;
        }
        System.out.println("Final result :: " +s );

    }
}
