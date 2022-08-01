import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieMain {
    public static void main(String ... args) {
        Person p1 = new Person();
        p1.setId("123");
        List<String> p1MovieList = new ArrayList<>();
        p1MovieList.add("M1");
        p1MovieList.add("M2");
        p1.setMovieList(p1MovieList);

        Person p2 = new Person();
        p2.setId("555");
        List<String> p2MovieList = new ArrayList<>();
        p2MovieList.add("M3");
        p2MovieList.add("M4");
        p1.setMovieList(p2MovieList);

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        listMovies(personList);
    }

    public static void listMovies(List<Person> personList) {
        //List<String> movieList = personList.stream().map(person -> person.getMovieList()).flatMap(e -> e.stream()).collect(Collectors.toList());
        List<String> movieList = personList.stream().map(person -> person.getMovieList()).filter(Objects::nonNull).flatMap(personlist -> personlist.stream()).collect(Collectors.toList());
        System.out.println("Final movie list :: " + movieList);
    }
}
