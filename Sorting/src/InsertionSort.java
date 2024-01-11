import java.util.Arrays;

public class InsertionSort {
    public void insertionSort(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            System.out.println("Key: " + key);
            int j = i-1;
            while (j>=0 && arr[j]>key){
                arr[j + 1] = arr[j];
                System.out.println("Before final: " + Arrays.toString(arr));
                j--;
            }
            arr[j+1] = key;
            System.out.println("After final: " + Arrays.toString(arr));
        }
    }
}
