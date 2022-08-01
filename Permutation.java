import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public List<List<String>> permute(String[] nums) {

        List<List<String>> resultList = new ArrayList<>();

        backtrack(resultList, new ArrayList<>(), nums);
        return resultList;
    }

    private void backtrack(List<List<String>> resultList,
                           ArrayList<String> tempList, String[] arrs) {
        // If we match the length, it is a permutation
        if (tempList.size() == arrs.length) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for (String str : arrs) {
            // Skip if we get same element
            if (tempList.contains(str))
                continue;

            // Add the new element
            tempList.add(str);

            // Go back to try other element
            backtrack(resultList, tempList, arrs);

            // Remove the element
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String ... args) {
        Permutation per = new Permutation();
        List<List<String> >result = per.permute(new String[] {"B","O","A", "T"});
        System.out.print(result);
    }

}