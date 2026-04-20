public class DecimalToBinary {
    
    public static void decimalToBinary(int decimalNumber){
        int myNumber = decimalNumber;
        int binary = 0;
        int power = 0;

        while(decimalNumber > 0){
            int remainder = decimalNumber % 2;

            binary = binary + (remainder * (int)Math.pow(10,power));     //..........can use (1<<power) instead of Math.pow(10,power) for better performance
            power++;
            decimalNumber = decimalNumber / 2;
        }
        System.out.println("The binary representation of " + myNumber + " is: " + binary);
    }

    public static void main(String[] args){
        decimalToBinary(10);
    }
}
