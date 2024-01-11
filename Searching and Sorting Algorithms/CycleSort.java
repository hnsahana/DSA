import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args){
        int[] arr = {6, 2, 5, 3, 0, 1, 4};
        cycleSortFromZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Cycle sort is used to sort numbers in range of 0 to N or 1 to N
    // For range 0 to N, the correct index of element arr[i] = arr[i], because 0 will be at index 0
    // For range 1 to N, the corret index of element arr[i] = arr[i]-1, because 1 will be at index 0

    /*
     * We'll loop from i=0 to i=n, and check if the ith element is at the correct index,
     * if it is, we'll move to next index.
     * Otherwise , we'll swap the current element with the element at its correct index
     */

    // For range 1 to N
    static void cycleSortFromOne(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                //swap elements at i and correctIndex
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                //move to next index
                i++;
            }
        }
    }

    // For range 0 to N
    static void cycleSortFromZero(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i]; // Only this line changes
            if(arr[i] != arr[correctIndex]){
                //swap elements at i and correctIndex
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                //move to next index
                i++;
            }
        }
    }
}
