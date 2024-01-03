public class MergeSort {
    public void mergesort(int [] arr){
        mergesort(arr,0,arr.length);
    }

    private void mergesort(int[] arr, int start, int end) {
        if(start<end-1){
            int mid = start + (end-start)/2;
            mergesort(arr,start,mid);
            mergesort(arr,mid,end);
            merge(arr,start,mid,end);
        }
    }

    private void merge(int [] arr, int start, int mid, int end){
        int [] merged = new int[end-start];
        int i = start;
        int j = mid;
        int k = 0;
        while (i<mid && j<end) merged[k++] = arr[i]<arr[j]?arr[i++]:arr[j++];
        while (i<mid) merged[k++] = arr[i++];
        while (j<end) merged[k++] = arr[j++];

        for (int l = 0; l < k; l++) {
            arr[l+start] = merged[l];
        }
    }
}
