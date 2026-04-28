public class BinarySearch {

    public static int binarySearch(int number[], int key){

        int start = 0;
        int end = number.length-1;
        
          while(start <= end){
                //middle value
                int middle = (start+end)/2;
                
                //compare middle value and shifting
                if(number[middle] == key){
                    return middle;
                }

                if(number[middle] < key){
                    start = middle+1;
                }else{
                    end = middle-1; 
                }
          } 
    return -1;
    }
    public static void main(String[] args){
        int number[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        int index = binarySearch(number, key);
        
        if(index == -1){
            System.out.print("Not found");
        }else{
            System.out.print("The key is at index : " + index);
        }
    }
}
