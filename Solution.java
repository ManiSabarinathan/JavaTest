import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int inMaxValue = Integer.parseInt(scanner.next());
        System.out.println("inMaxValue :: " + inMaxValue);

        List<String> inputList = new ArrayList<>();
        //read input lines
        for(int i=0;i<inMaxValue; i++) {
            inputList.add(scanner.nextLine());
            System.out.println("Loop :: "+ i);
        }
        System.out.println("InputList" + inputList);

//        List<String> outList = new ArrayList<>();
//        int outMax = scanner.nextInt();
//        for(int i=1;i<=outMax;i++) {
//            outList.add(scanner.next());
//        }
//        outList.stream().forEach(data -> {
//            String arr[] = data.split(" ");
//            int lineNumber = Integer.parseInt(arr[0]);
//            int fetchNumber = Integer.parseInt(arr[1]);
//            String line = inputList.get(lineNumber);
//            List<Integer> lineList = Stream.of(line.split(" ")).map(Integer::valueOf)
//                    .collect(Collectors.toList());
//            Integer result = lineList.get(fetchNumber);
//            if(result != null){
//                System.out.println(result);
//            } else {
//                System.out.println("ERROR!");
//            }
//        });
    }
}