public class HallowRombus{

    public static void hallow_Rombus(int num){
        for(int i=1; i<=num; i++){
            //spaces
            for(int j=1; j<=(num-i); j++){
                System.out.print("   ");
            }

            //hollow rectangle square
            for(int j=1; j<=num; j++){
                if( i==1 || i == num || j==1 || j==num){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }
    public static void main(String [] args){
        hallow_Rombus(5);
    }
}