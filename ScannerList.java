import java.util.Scanner;

public class ScannerList {
    public static void main(String ... args) {
        Scanner scanner = new Scanner(System.in);

        int max = scanner.nextInt();
        for(int i=0;i<max;i++) {
            System.out.println(scanner.nextLine());
        }
    }
}
