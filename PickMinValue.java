public class PickMinValue {
    public static void main(String ... args) {
        int arr[] = {4, 6, 5, 3, 3, 1};
        pickMinVal(arr);
    }

    private static void pickMinVal(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            int minValue = arr[0];
            int maxValue = arr[1] - minValue >1 ? minValue:arr[1];
        }
    }
}
