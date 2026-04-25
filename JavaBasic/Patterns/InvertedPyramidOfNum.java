public class InvertedPyramidOfNum{

    public static void InvertPyramidOfNum(int n){
        for( int line = 1; line <= n; line++){
            for( int ch= 1; ch <= n-line+1; ch++){
                System.out.print(ch + " ");
        } 
            System.out.println();
        } 
    }

    public static void main(String[] args){
        InvertPyramidOfNum(10);
    }
}