package opgave_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Cafe {

    Scanner reader;
    Scanner scan;
    String header;
    File file;
    ArrayList<Drink> menu;
    Drink drink=new Drink();


    Cafe (){
    createMenu();
    }



    public void createMenu (){
    try{
        file=new File("data/opgave_6.csv");
        reader=new Scanner(file);

        header=reader.nextLine();
        menu=new ArrayList<>();
        while (reader.hasNextLine()){
            String line=reader.nextLine();
            String [] data = line.split(",");

            String name = data[0].trim();
            int price = Integer.parseInt(data[1].trim());
            int soldNumber = Integer.parseInt(data[2].trim());

            menu.add(new Drink(name, price, soldNumber));
        }

    }catch(NumberFormatException e){
        System.out.println("not a number");
    }catch (FileNotFoundException e) {
        System.out.println("file not found");
    }
    }

    public void printMenu(){
        int counter=1;
        for (Drink d:menu){
            System.out.println(counter+" - "+d.getName()+", "+d.getPrice());
            counter++;
        }
    }

    public void promptCustomer(){
        scan =new Scanner(System.in);
        System.out.println("choose a drink from the menu");
        int input= scan.nextInt();
        System.out.println("you chose: "+menu.get(input-1).getName()+", "+menu.get(input-1).getPrice()+" kr.");
        menu.get(input-1).oneSold();
        System.out.println(menu.get(input-1).getSoldNumber());
        savaData();

    }




    public void savaData (){

        try{
        FileWriter writer = new FileWriter(file);
        writer.write(header+"\n");

        for (Drink d:menu){
            writer.write(
                    d.getName()+", "
                    + d.getPrice()+", "
                    + d.getSoldNumber()
                    +"\n");
        }writer.close();
    }catch(IOException e){
            System.out.println("der blev ikke skrevet til filen - OBS OBS OBS");
        }
    }






}
