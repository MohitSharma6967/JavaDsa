public class LinearSearchString {

    public static int linearSearch(String Menu[],String key){
        for(int i = 0; i < Menu.length; i++){
            if(Menu[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String Menu[] = {"Dosa", "chola", "burger", "fries", "coffee", "mazza", "coke"};
        String key = "coke";

        int index = linearSearch(Menu, key);

        if(index == -1){
            System.out.print("Not found");
        }else{
            System.out.print("The index of key is at : " + index);
        }
    }
}
