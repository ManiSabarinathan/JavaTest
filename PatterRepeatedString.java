import java.util.regex.Pattern;

public class PatterRepeatedString {
    public static void main(String ... args) {
        String str = "This is is a good good sign";
        Pattern pattern = Pattern.compile("\\b (w+) (W+\\1  \\b)+");
    }
}
