public class TriangleTest {
    public static void main(String ... args) {

        int max = 5;
        //triangle1(max);
        triangle2(max);

    }



    private static void triangle2(int max) {
       for(int i = 1;i<=max;i++){
           for(int j=max-i;j>=1;j--){
               System.out.print(" ");
           }
           for(int k=1;k<=i;k++) {
               System.out.print("*");
           }

           System.out.println();
       }


    }

    private static void triangle1(int max) {
        for(int i=1;i<=max;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        /*
         *
         *  *
         *  *  *
         *  *  *  *
         */
    }

}
