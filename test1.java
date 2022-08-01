import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test1 {
    public static void main(String ... arg) {
        User u1 = new User();
        u1.setFirstName("sabari");
        List l1 = new ArrayList<>();
        l1.add("m1");l1.add("m2");
        u1.setMovieList(l1);

        User u2 = new User();
        u2.setFirstName("nathan");
        List l2 = new ArrayList<>();
        l2.add("m3");l2.add("m4");
        u2.setMovieList(l2);

        List<User> userList = new ArrayList();
        userList.add(u1);
        userList.add(u2);
        List resultList = userList.stream().map(u -> u.getMovieList()).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(resultList);

        //resultList.stream().flatMap(Collection::stream).collect(Collectors.toList());
//        List finalList = new ArrayList();
//        resultList.stream().flatMap(e -> Stream.of(e)).forEach(ee-> {
//            finalList.add(ee);
//        });
//        System.out.println("=====> " + finalList);

    }

}
