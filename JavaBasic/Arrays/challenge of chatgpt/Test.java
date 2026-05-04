// After BinarySearch, LargestInArray, LinearSearch, LinearSearchString
// PairsOfArray, PrintSubArray, ReverseAnArray


public class Test {

    //largestOfTwo
    public static void largestOfTwo(int number[]){
        int largest = Integer. MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i =0; i < number.length; i++ ){

            if(largest < number[i]){
                secondLargest = largest;
                largest = number[i];
            }else if(secondLargest < number[i] && largest != number[i]){
                secondLargest = number[i];
            }
        }
        System.out.print(secondLargest);
    }


    //----------------------------------------------------------------------------------------------------------------------------------
    //Even/Odd



    public static void oddEven(int number[]){

    int even = 0;
    int odd = 0;

        for(int i = 0; i < number.length; i++){
            if(number[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);
    }


    //----------------------------------------------------------------------------------------------------------------------------------
    //Check sorted

    public static boolean checkSorted(int number[]){

        for (int i = 0; i < number.length - 1; i++){
            if(number[i] > number[i + 1]){
                return false;
            }
        }
        return true;
    }


    //----------------------------------------------------------------------------------------------------------------------------------
    //misssing number

    public static void missingNumber(int number[]){

        int n = number.length + 1;

        int estimatedSum = n*(n+1)/2; 

        int currentSum = 0;

        for(int i = 0; i < number.length; i++){
            currentSum = currentSum + number[i];
        }

        int missing = estimatedSum - currentSum;
        System.out.print("The missing number in array is : " + missing);
    }


    
    
    public static void main(String[] args){
        // int number[] = {3, 4, 6, 8 ,1, 7};
        // largestOfTwo(number);


        // int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // oddEven(number);

        // int number[] = {1, 2, 3, 4, 5, 6,7,  8, 9};
        // System.out.println(checkSorted(number)); 

        // int number[] = {1, 2, 3,4, 5, 6, 8, 9};
        // missingNumber(number); 
        

    }
}