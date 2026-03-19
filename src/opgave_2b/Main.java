package opgave_2b;

import java.util.ArrayList;

public class Main {
    static ArrayList<String> items = new ArrayList<>();


    static void main (String [] args){

        createList();
        try{
        System.out.println(getItem(items, 5));
        }catch (IllegalArgumentException i){
            System.out.println(i.getMessage());
        }








    }

    public static void createList(){
        items.add("lampeskærm");
        items.add("guitar");
        items.add("højtaler");
        items.add("rod");
        items.add("simracer");

    }

    public static String getItem(ArrayList<String> items, int index) {

        if (index <0 || index>=items.size()){
            throw new IllegalArgumentException("Du er out of bounds");
        }
        return items.get(index);
    }


}
