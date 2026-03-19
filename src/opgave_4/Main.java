package opgave_4;

import java.util.ArrayList;

public class Main {

    static void main(String[] args){

        ArrayList<String> data = new ArrayList<>();
        data.add("Espresso, En kraftfuld og koncentreret kaffe, 25.0");
        data.add("Latte, Espresso med dampet mælk, 45.0");
        data.add("Cola, Kold og brusende, 30.0");
        data.add("Vand, Stille kildevand, gratis"); //numberfformatexception

try {
    for (String s : data) {
        String[] line = s.split(",");
        String header = line[0].trim();
        String description = line[1].trim();
        double price = Double.parseDouble(line[2].trim());

        System.out.println(header + " - " + description + " (" + price + " kr.)");
    }
}catch(NumberFormatException e){
    System.out.println("Du har ikke indtastet et tal "+e.getMessage());
}








//        for (String s:data) {
//            String[] line = s.split(",");
//
//            System.out.print(line[0].trim()+" - ");
//
//            for (int i = 1; i < line.length; i++) {
//                line[i].trim();
//                System.out.print(line[i]);
//            }System.out.println();
//        }









    }
}
