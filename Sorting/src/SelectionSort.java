public class SelectionSort {
    public void selectionSort(int [] arr){
        for(int i = 0 ; i < arr.length-1 ; i++){
            int maxIndex = arr.length-i-1;
            int maxValue = Integer.MIN_VALUE;
            for (int j = 0; j < arr.length - i; j++) {
                if(maxValue<arr[j]){
                    maxValue = arr[j];
                    maxIndex = j;
                }
            }
            Main.swap(arr,maxIndex,arr.length-i-1);
        }
    }
}
