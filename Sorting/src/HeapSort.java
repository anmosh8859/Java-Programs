public class HeapSort {

    public void heapSort(int [] arr){
        buildHeap(arr);
        for (int i = arr.length-1; i >= 0; i--) {
            Main.swap(arr, i, 0);
            heapify(arr,0, i);
        }
    }

    private void buildHeap(int [] arr){
        for (int i = (arr.length-2)/2 ; i >=0 ; i--) {
            heapify(arr,i, arr.length);
        }
    }
    private void heapify(int [] arr, int index, int end){
        int leftInd = 2*index+1;
        int rightInd = 2*index+2;
        int largest = index;
        if(leftInd<end && arr[largest]<arr[leftInd]) largest = leftInd;
        if(rightInd<end && arr[largest]<arr[rightInd]) largest = rightInd;
        if(largest!=index){
            Main.swap(arr,index,largest);
            heapify(arr,largest,end);
        }
    }

}
