import java.util.Arrays;
public class BubbleSort {
    public static void main(String args[]){
        int[] arr = {1, 1, 1 , 97, 3, 7, 2 , 7, 9, 1, 2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Bubble Sort Algorithm to sort an array in ascending order
    // During each pass, we'll compare the adjacent elements and swap tehm if they are in the incorrect order
    // After each pass, the largest element of that pass gets situated at its correct position
    // The array gets sorted from the last element 
    // After each pass the space to sort gets reduced to 0 to n-1-i 

    static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    //Let's make a different swap function
                    //or you can just write it here
                    swap(arr, j, j+1);
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
