public class QuickSort {

    public void quickSort(int [] arr){
        quickSort(arr,0,arr.length);
    }

    private void quickSort(int[] arr, int start, int end) {
        if(start<end-1){
            int partition = partition(arr,start,end);
            quickSort(arr,start,partition);
            quickSort(arr,partition,end);
        }
    }

    private int partition(int [] arr, int start, int end){
        int pivot = arr[end-1];
        int j = start-1;
        for (int i = start; i < end-1; i++) {
            if(arr[i]<=pivot){
                j++;
                Main.swap(arr,i,j);
            }
        }
        Main.swap(arr,end-1,j+1);
        return j+1;
    }

}
