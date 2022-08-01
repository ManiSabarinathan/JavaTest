import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VowelsTest {
    public static void main(String ... args) {
        String str = "sabari";
        getVowelCount(str);
        printCharCount(str);
        printCharCountMapMerge(str);
        //printVowelAndCount(str);
    }

    public static void getVowelCount(String str) {
        Long vCount = str.chars().filter(  c ->
                        (char)c == 'a' ||
                        (char)c == 'e' ||
                        (char)c == 'i' ||
                        (char)c == 'o' ||
                        (char)c == 'u').count();
        System.out.println("Vowel count :: "+  vCount);
    }

    //https://farenda.com/java/java-8-count-frequency-of-chars-in-string/
    public static void printCharCount(String str) {
        Map<Character, Integer> resultMap = str.chars().boxed()
                .collect(Collectors.toMap(k -> (char)k.intValue(), v-> 1, Integer::sum));
         System.out.println(resultMap);
    }

    public static void printCharCountMapMerge(String str) {
        Map<Character, Integer> resultMap = new HashMap<>();
        for(char c: str.toCharArray()) {
            resultMap.merge(c,1,Integer::sum);
        }
        System.out.println("Result Map using map merge method :: " +resultMap);

    }
}
