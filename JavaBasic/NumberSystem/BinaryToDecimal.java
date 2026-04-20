public class BinaryToDecimal {

    public static int BinaryNum(int n){
        int decimal = 0;
        int pow = 0;

        while(n>0){
            int lastDigit = n%10;
            decimal = decimal + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            n = n/10;
        }
        return decimal;
    }
    public static void main(String[] args){
        System.out.println(BinaryNum(111));
    }    
}


// copilot alternative:

// public class BinaryToDecimal {
    
//     public static int binaryToDecimal(int binaryNumber) {
//         int decimal = 0;
//         int power = 0;
        
//         while (binaryNumber > 0) {
//             int lastDigit = binaryNumber % 10;
//             decimal += lastDigit * (1 << power);  //......................................................... Bit shifting instead of Math.pow
//             power++;
//             binaryNumber /= 10;
//         }
//         return decimal;
//     }
    
//     public static void main(String[] args) {
//         System.out.println(binaryToDecimal(111));    // 7
//         System.out.println(binaryToDecimal(1010));   // 10
//         System.out.println(binaryToDecimal(11111111)); // 255
//     }
// }