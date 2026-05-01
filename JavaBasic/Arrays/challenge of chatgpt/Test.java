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
    public static void main(String[] args){
        int number[] = {3, 4, 6, 8 ,1, 7};
        largestOfTwo(number);

        
    }
}