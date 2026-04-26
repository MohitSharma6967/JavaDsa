public class SolidRombus {

    public static void rombus(int num){
        //for lines
        for(int i = 1; i <= num; i++){

            //spaces
            for(int j = 1; j <= (num-i); j++){
                System.out.print("   ");
            }
            for(int j = 1; j <=num; j++){
                System.out.print(" * ");
            }

        System.out.println();
        }
    }
    public static void main(String[] args){
        rombus(10);
    }
}
