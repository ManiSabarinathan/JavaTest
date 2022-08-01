import java.util.regex.Pattern;

public class RegexTest2 {
    public static void main(String ... args) {
//        String regex="^[a-z][0-9][^a-z][^A-Z][A-Z]{5}";
//        String str="h4CkR"; //true
//        String regex=  "^[a-z][0-9][^a-z][^A-Z][A-Z]{5,6}$";
        String regexx =  "^[a-z][1-9][^a-z][^A-Z][A-Z].*{5,}";
        String str="h4CkR"; //true

        boolean isMatching = Pattern.matches(regexx,str);
        System.out.println("isMatching2??? " + isMatching);
    }
}

//Task
//
//        Write a RegEx that will match a string satisfying the following conditions:
//
//        The string's length is >=5
//        The first character must be a lowercase English alphabetic character.
//        The second character must be a positive digit. Note that we consider zero to be neither positive nor negative.
//        The third character must not be a lowercase English alphabetic character.
//        The fourth character must not be an uppercase English alphabetic character.
//        The fifth character must be an uppercase English alphabetic character.
//        In the editor below, replace the blank (_________) with a RegEx pattern satisfying the criteria above. This is a RegEx-only challenge, so you are not required to write any additional code.