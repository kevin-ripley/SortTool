/*
 * ESOF 322 HW 2. Blixt and Ripley
 */
package sorttool;


public abstract class Tools {
    /* Instance Variables */
    protected SortBehavior sb;
    
    
    public int[] performSort(int[] arr){
        /* Calls SortBehavior sorting function. */
        arr = sb.sort(arr);
        return arr;
    }
    
    public void setSort(SortBehavior st){
        sb = st;
    }
    
}  /* END Tools class. */
