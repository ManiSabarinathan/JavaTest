import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String ... args) {
        //think?
        String str = "sa";
        String regex = "[^0-9]+";
        boolean isMatching = Pattern.matches(regex, str);
        System.out.println("isMatching?? :::  " + isMatching);


    }
}

//https://www.hackerrank.com/challenges/excluding-specific-characters/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
//
//Task
//
//        You have a test string .
//        Your task is to write a regex that will match  with the following conditions:
//
//        S must be of length 6.
//        First character should not be a digit (  or  ).
//        Second character should not be a lowercase vowel (  or  ).
//        Third character should not be b, c, D or F.
//        Fourth character should not be a whitespace character ( \r, \n, \t, \f or <space> ).
//        Fifth character should not be a uppercase vowel (  or  ).
//        Sixth character should not be a . or , symbol.