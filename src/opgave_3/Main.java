package opgave_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner reader;
    static Scanner scan;
    static ArrayList <String> linesRead;
    static ArrayList <String> lines;
    static File file;
    static File file2;

    static void main (String[] args){


        try {
            System.out.println(readLines("data/opgave_3_file.csv"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        for (String s:linesRead){
            System.out.println(s);
        }


        try {
            System.out.println(readLines2("data/opgave_3_2.csv"));
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        for (String s:lines){
            System.out.println(s);
        }







    }


    public static ArrayList<String> readLines(String path) throws FileNotFoundException {

        file = new File("data/opgave_3_file.csv");
        reader = new Scanner(file);
        linesRead = new ArrayList<>();

        while(reader.hasNextLine()){
            linesRead.add(reader.nextLine());
        }
        reader.close();
        return linesRead;
    }



    public static ArrayList<String> readLines2(String path) throws FileNotFoundException {
        lines = new ArrayList<>();
        file2 = new File("data/opgave_3_2.csv");
        scan = new Scanner(file2);

            while (scan.hasNextLine()) {
                lines.add(scan.nextLine());
            }
            scan.close();
            return lines;
        }




}


