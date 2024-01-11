class BinarySearch{
    public static void main(String[] args){
        int[] arr = {3, 6, 8, 9, 13, 45}; //output should be -1
        System.out.println(binarySearch(arr, 1));
    }

    //Binary Search Algorithm - Only for sorted array
    //Task : Find the position of a given key element or target element in a given array.
    // Return the index if found, return -1 if not found
    //Binary Search Algorithm reduces the search space with each iteration

    static int binarySearch(int[] arr, int key){
        //Initialize low and high variables:
        //low = first element of the array initially
        //high = last element of the array initially

        int low = 0; 
        int high = arr.length - 1;

        //Condition fails when low becomes greater than high
        while(low <= high){
            //find the mid index using low and high
            int mid = low + (high - low)/2;

            if(arr[mid] == key){
                return mid; //return the index when the key element ia found
            }else if (arr[mid] < key){
                low = mid + 1;  //search to the right of mid element
            }else{
                high = mid - 1; //search to the left of the mid element
            }
        } 

        //If the key element is not found, return -1.
        return -1;
    }
}