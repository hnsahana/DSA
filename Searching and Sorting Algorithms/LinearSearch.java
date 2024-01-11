class LinearSearch{
    public static void main(String[] args){
        int[] arr = {3, 6, 2, 99, 1, 34, 19};
        System.out.println(linearSearch(arr, 19));
    }

    //Linear Seeach Function

    //Search the given key or target element in the given array

    //In Linear Search we loop through the array and check and compare the key element with each element in the array

    static int linearSearch(int[] arr, int key){
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                // We return the position where the key element is found
                return i;
            }
        }
        //If the key element is not found, we return -1.
        return -1;
    }
}