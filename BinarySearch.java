public class BinarySearch {
    static int sElement = 60;
    static int arr[] = new int[] {10,20,30,40,50,60,70,80,90};


    public static void main(String ... args) {
        BinarySearch search = new BinarySearch();
        int resultIndex =  search.bSearch(0, arr.length-1);
        System.out.println("Result Index:: " + resultIndex);
    }

    public int bSearch( int low, int high) {
        System.out.println("Search element :: " + sElement);
        int mid = (low + high) / 2;
        if(low>high)  return -1;

            if (arr[mid] == sElement) {
                return mid; //returns index of search element
            }
            if (sElement > arr[mid]) {
                return bSearch( mid + 1, high);
            } else {
                return bSearch( low, mid-1);
            }
        }
}
