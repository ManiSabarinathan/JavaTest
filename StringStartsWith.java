import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStartsWith {
    public static void main(String ... args) {
        List<String> resultList = Stream.of("abc","xyz","Ada")
                .map(String::toLowerCase)
                .filter(in -> in.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(resultList);
    }
}
