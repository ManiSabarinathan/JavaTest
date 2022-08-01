import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test2 {
    public static void main(String ... args) {
        test2 obj = new test2();
       // obj.arrayLimitMethod();
        String str="Williams-Sonomaa";
        obj.charCountLegacy(str);
        obj.charCountMap(str);

        obj.findsum();
    }

    public void charCountLegacy(String s) {
        char[] cArr = s.toCharArray();
        Map<Character,Integer> charMap = new HashMap<>();
        for(char c : cArr) {
            if(charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c)+1);
            } else {
                charMap.put(c,1);
            }
        }

        System.out.println(charMap);
//        charMap.entrySet().forEach(entry -> {
//            System.out.println("Key :: "+ entry.getKey() + " and value :: "+ entry.getValue());
//        });

    }

    public void charCountMap(String str) {
//        char[] cArr = s.toCharArray();
//        List<Character> charList=new ArrayList();
//        for(char c: cArr) {
//            charList.add(c);
//        }
//        System.out.println("Char Array :: " +  Arrays.toString(cArr));
//        System.out.println("List :: " + charList);
        //charList.stream().collect(Collectors.toMap(k->k, v->count++)



        Map<Character, Integer> charCount = str.chars().boxed().collect(Collectors.toMap(
                k -> (char)k.intValue(),
                v -> 1,
                Integer::sum)
        );
        System.out.println(charCount);
    }
    public void arrayLimitMethod() {
        int iArr[] = new int[] {10,200,20,30,40,50};
        int subIntAry[] = Arrays.stream(iArr).limit(4).toArray();
        System.out.println("Int Array :: " + Arrays.toString(iArr));
        System.out.println("SubInt array :: " + Arrays.toString(subIntAry));

    }

    public void findsum() {
        Stream<Integer> intStream = Stream.of(1,2,3,4,5);
        int sum = intStream.collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum value using stream :: " + sum);
    }

}

//
//op
//Body {
//    name:
//    age:
//}
//
//if(name!=null) {
//    if(name)
//        }
//
//actuator:

//info
//health
//heapdump
//threaddump
//config
//
//
//40