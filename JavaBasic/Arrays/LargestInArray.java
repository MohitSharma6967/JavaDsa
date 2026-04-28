public class LargestInArray {

    public static int largest(int number[]){

        int largest = Integer.MIN_VALUE; 

        for(int i = 0; i < number.length; i++){
            if(number[i] > largest){
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args){
        int number[] = {1, 2, 6, 3, 16, 4, 91, 32, 5};

        System.out.print("largest value is : " + largest(number));
    }
}