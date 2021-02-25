public class quicksort {

    //private static int[] arr;
    public static int[] arr;

    public static void main(String args[]){
        System.out.println("Hello world!");
        arr = new int[]{10,16,8,12,15,6,3,9,5};
        int low = arr[0];
        int high = arr[arr.length-1];
        System.out.println(quicksort(low,high);

    }


    public static void quicksort(int low, int high){
        if(low < high){
            int j = partition(low,high);
            quicksort(low, j);
            quicksort(j+1, high);
        }
    }

    public static int partition(int low, int high){
        int i = low;
        int j = high;

        int pivot = arr[low];

        while(i<j){
            while(i <= pivot){
                i++;
            }
            while(j > pivot){
                j--;
            }
            swap(arr[i], arr[j]);
        }
        swap(arr[low], arr[j]);

        return j;
    }

    public static void swap(int i, int j ){
        int temp = i;
        i = j;
        j = temp;
    }
}
