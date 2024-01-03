import java.util.Arrays;

public class Main {

    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {42, -15, 0, 27, -8, 31, -20, 13, 56, -33};
        System.out.println(Arrays.toString(arr));

//        new SelectionSort().selectionSort(arr);
//        new InsertionSort().insertionSort(arr);
//        new BubbleSort().bubbleSort(arr);
//        new HeapSort().heapSort(arr);
//        System.out.println(new QuickSort().partition(arr,0, arr.length));
//        new QuickSort().quickSort(arr);
        new MergeSort().mergesort(arr);
        
        System.out.println(Arrays.toString(arr));
    }
}