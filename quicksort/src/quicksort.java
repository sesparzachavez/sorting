import java.util.Arrays;

public class quicksort {

    public static void main(String args[]){
       int[] arr;
        arr = new int[]{10,16,8,12,15,6,3,9,5};
        int low = 0;
        int high = arr.length-1;

        quicksort(arr, low,high);

        System.out.println(Arrays.toString(arr));

    }

    public static void quicksort(int [] arr, int low, int high){
        if(low < high){
            int j = partition(arr, low,high);
            quicksort(arr,low, j-1);
            quicksort(arr, j+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low+1;
        int j = high;

        while(i<=j){
            while((i <= high) && (arr[i] <= pivot)){
                i++;
            }
            while(j > low && arr[j] > pivot ){
                j--;
            }
            if(i>=j)
                break;
           swap(arr, i, j);
        }
        swap(arr,low, j);

        return j;
    }

    public static void swap(int[] arr, int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
