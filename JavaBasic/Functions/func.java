// import java.util.*;

public class func {
    public static void HelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int multiple(int a, int b){
        int multiple = a * b;
        return multiple;
    } 

    public static int factorial(int n){
        int f = 1;
            for(int i = 1; i<=n; i++){
                f = f * i; 
            }
        return f;    
    }

    public static int BinomialCoefficient(int n, int r){
                int nFactorial = factorial(n);
                int rFactorial = factorial(r);
                int nmrFactorial = factorial(n-r);
                int BioCoff = nFactorial/(rFactorial*nmrFactorial);
                return BioCoff;    
    }

    public static boolean isPrime(int n){

        boolean isPrime = true;

        if(n<=2){
            return true;
        }

        for(int i = 2; i <= n-1; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of a:");
        // int a = sc.nextInt();
        // System.out.println("Enter the value of b:");
        // int b = sc.nextInt();
        // int sum = sum(a,b);
        // System.out.print("The sum is:" + sum);

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter value of a = ");
        // int a = sc.nextInt();
        // System.out.print("Enter value of b = ");
        // int b = sc.nextInt();
        // int multiple = multiple(a,b);
        // System.out.println(multiple); 

        // int fact = factorial(4);
        // System.out.println(fact);

        // int n = 5;
        // int r = 2;
        // int Binomialcoeff = BinomialCoefficient(n,r);
        // System.out.println(Binomialcoeff);


        System.out.println(isPrime(2));
    }
}
 