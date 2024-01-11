class Factorial{
    public static void main(String[] args){
        System.out.println("Without recursion: " + getFactorial(8));

        System.out.println("With recursion: " + getFactorialWithRecursion(8));
    }

    //FUnction to find factorial of a number with recursion
    static int getFactorialWithRecursion(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        return num*getFactorialWithRecursion(num-1);
    }

    //Function to find the factorial of a number with iteration
    static int getFactorial(int num){
        
        if(num == 0 || num == 1){
            return 1;
        }

        int factorial = 1;
        for(int i=2; i<=num; i++){
            factorial *= i;
        }
        return factorial;
    }
}