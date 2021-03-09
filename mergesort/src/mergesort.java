import java.util.Arrays;

public class mergesort {
    public void mergeSort(double[] array) {

        if (array.length > 1) {
            double[] left = get_left(array);
            double[] right = get_right(array);

            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
    }
    public double[] get_left(double[] array) {
        int size = array.length / 2;
        double[] left = new double[size];
        for (int i = 0; i < size; i++) {
            left[i] = array[i];
        }
        return left;
    }

    public double[] get_right(double[] array) {
        int size;
        if(array.length % 2 != 0){
            size = (array.length/2) +1;
        }else{
            size = array.length/2;
        }

        double[] right = new double[size];

        int mid = (array.length / 2);
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }
        return right;
    }


    private void merge(double[] array, double[] left, double[] right) { // L- 1    R- 10
        int i = 0, j = 0, index = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j])
                array[index++] = left[i++];
            else
                array[index++] = right[j++];
        }
        while (j < right.length) {
            array[index++] = right[j++];
        }
        while (i < left.length) {
            array[index++] = left[i++];
        }

    }

    public static void main(String args[]) {
        mergesort arr = new mergesort();
        double[] array = new double[]{10,16,8,12,15,6,3,9,5};
        arr.mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}

//    public static void main(String args[]){
//        System.out.println("hello");
//        int [] arr = new int []{9,3,7,5,6,4,8,2};
//        int low = 0;
//        int high = arr.length-1;
//
//        mergesort(arr, low,high);
//
//
//    }
//
//    public static void mergesort(int [] arr,int low, int high){
//        int mid;
//        if(low < high){
//            mid = (low + high)/2;
//            mergesort(arr, low, mid);
//            mergesort(arr, mid+1, high);
//            merge(arr, low, mid, high);
//
//        }
//    }
//
//    public static void merge(int [] arr, int low, int mid, int high){
//            // A array or left array is low to mid
//            //B array or right array is mid+1 to high
//
//
//            int i = 0, j = 0, k = 0;
//            while(low<= mid && j <= high){
//                if(arr[i]<arr[j])
//
//            }
//    }

