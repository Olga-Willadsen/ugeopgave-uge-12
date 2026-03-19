package opgave_1_2;

import java.util.Scanner;

public class Ui {

    Scanner scan = new Scanner(System.in);

    public int promptNumber(String msg) {
        try {
            System.out.println(msg);
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("det var ikke et tal");
        } return 0;
    }

    public int promptNumber2(String msg) {
        int input=0;
        try {
            System.out.println(msg);
            input = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("det var ikke et tal");
        } return input;
    }

    public int promptNumber3(String msg) throws NumberFormatException{
            System.out.println(msg);
            int input = Integer.parseInt(scan.nextLine());
            return input;
    }







}
