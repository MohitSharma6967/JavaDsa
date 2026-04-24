public class pattern{

    public static void HallowPattern(int totalRows, int totalColumn){

        //for rows..line
        for(int i = 1; i <= totalRows; i++){
            for(int j = 1; j <= totalColumn; j++){
                if( i==1 || i==totalRows || j==1 || j==totalColumn){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        HallowPattern(4,5);
    }
}
