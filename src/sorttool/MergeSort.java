/*
 * Merge sort implementation.
 */
package sorttool;

public class MergeSort implements SortBehavior {
    
    /* Constructor. */
    MergeSort(){}
    
    @Override
    public int[] sort(int[] arr){
        /* Merge Sort implementation. */
               
        /* Do merge sort. */
        if(arr.length <= 1){
            return arr;
        } else if(arr.length > 1){
            /* Split array recursively. */
            int[] tempArr1 = new int[arr.length/2];
            int[] tempArr2 = new int[arr.length - tempArr1.length];
            int i = 0;
            /* Fill tempArr1 */
            while(i < tempArr1.length){
                tempArr1[i] = arr[i];
                i++;
            }
            i = 0;
            while(i < tempArr2.length){
                tempArr2[i] = arr[(tempArr1.length) + i];
                i++;
            }
            /* Sort Array. */
            tempArr1 = sort(tempArr1);
            tempArr2 = sort(tempArr2);
            
            /* Do merge. */
            mergeSort_h(tempArr1, tempArr2, arr);
        }
        /* The size of the array is 1 or it's sorted. */
        return arr;
    }
    
    /* Helper method for merge sort. merges arrays. */
    private void mergeSort_h(int[] tempArr1, int[] tempArr2, int[] sortArr){
        int i = 0, j = 0;
        while(i + j < sortArr.length){
                if((i < tempArr1.length && j < tempArr2.length) && tempArr1[i] > tempArr2[j]){
                    /* move to sorted array and increment i*/
                    sortArr[i + j] = tempArr2[j];
                    j++;
                } else if((i < tempArr1.length && j < tempArr2.length) && tempArr2[j] > tempArr1[i]) {
                    /* move to sorted array and increment j */
                    sortArr[i + j] = tempArr1[i];
                    i++;
                } else if(i >= tempArr1.length){
                    /* tempArr1 is empty. */
                    sortArr[i + j] = tempArr2[j];
                    j++;
                } else {
                    /* TempArr2 is empty */
                    sortArr[i + j] = tempArr1[i];
                    i++;
                }
            }
    }
}
