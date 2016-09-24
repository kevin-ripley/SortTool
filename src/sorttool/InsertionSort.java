/*
 * Insertion sort implementation.
 */
package sorttool;

public class InsertionSort implements SortBehavior {
        
    @Override
    public int[] sort(int[] arr){
        /* Insertion sort implementation. */
        /* Do insertion sort. */
        int i = 0;
        int j = 0;
        int temp = 0;
        int temp2 = 0;
        while (i < arr.length - 1){
            if(arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i++;
                i = j;
                while (j - 1 >= 0){
                    if(arr[j] < arr[j-1]){
                        temp2 = arr[j];
                        arr[j] = arr[j-1];
                        temp2 = arr[j-1];
                        j--;
                    
                    } else {
                        j--;
                    }
                }
            } else {
                i++;
            }
        }   
       
        return arr;
    }
}
