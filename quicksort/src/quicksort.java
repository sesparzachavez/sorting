import java.util.Arrays;

public class quicksort {

    //private static int[] arr;


    public static void main(String args[]){
       int[] arr;
        System.out.println("Hello world!");
        arr = new int[]{10,16,8,12,15,6,3,9,5};
        int low = 0;
        int high = arr.length-1;

        quicksort(arr, low,high);

        System.out.println(Arrays.toString(arr));

    }


    public static void quicksort(int [] arr, int low, int high){
        if(low < high){
            int j = partition(arr, low,high);
            quicksort(arr,low, j);
            quicksort(arr, j+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low+1;
        int j = high;

        while(i<j){
            while((arr[i] <= pivot) && (i <= high)){
                i++;
            }
            while(arr[j] > pivot && j >= low){
                j--;
            }

           // swap(arr[i], arr[j]);
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
