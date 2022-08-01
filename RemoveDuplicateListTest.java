import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateListTest {
    public static void main(String ... args) {
        RemoveDuplicateListTest obj = new RemoveDuplicateListTest();

        List list = new ArrayList();
        list.add("C"); list.add("B"); list.add("A"); list.add("A"); list.add("C");
        System.out.println("Original list:: " + list);

        LinkedHashSet set = new LinkedHashSet(list);
        List uniqueList = new ArrayList(set);
        System.out.println("Unique elements in this :: "+ uniqueList);

        obj.removeDuplicateWith8(list);

    }

    public void removeDuplicateWith8(List list) {
        //List may contain duplicate elements
        //distinct() will remove duplicate from the list
        System.out.println("distinct result:: " + list.stream().distinct().collect(Collectors.toList()));
    }

}
