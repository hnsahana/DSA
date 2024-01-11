import java.util.*;
class SelectionSort{
    public static void main(String[] args){
        int[] arr = {5, 6, 2, 4, 1, 3};

        selectionSort(arr);

        //we need to import util class to use Arrays.toString()
        System.out.println(Arrays.toString(arr));
        
    }

    //Selection sort algorithm - used to sort an unsorted array in a certain order(either ascending or descending)
    //In selection sort we find the maximum element in each iteration and then swap it with elements from last.
    // first iteration : swap max element with n-1 th element
    //second iteration: swap 2nd max element with n-2 th element 
    // ans so on

    //After each iteration the largest element gets positoned at its right place in selection sort

    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int maxIndex = 0;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            //swap the element at maxIndex and n-i-1 index
            //call the swap function here
            //n = length of the array
            swap(arr, maxIndex, arr.length-i-1);
            
        }
    }

    //we can create a different function to swap the elements
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }

    //Sorry for the confusion. Bye!!
}