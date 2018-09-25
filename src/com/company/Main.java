package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        // writes array in a file
	/*int [] numbers = {1,5,7,8 ,4, 9};
        FileWriter fileWriter = new FileWriter( "Values.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (int i = 0; i<numbers.length; i++)
        {
            printWriter.println(numbers[i]);
        }
        printWriter.close();*/


        int[] numbers = new int[6];
        String str;
        int i = 0;

        // reads array from file

        FileReader fileReader = new FileReader("Values.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        str = bufferedReader.readLine();
        while(str!=null&& i<numbers.length)
        {
            numbers[i]= Integer.parseInt(str);
            i++;
            str= bufferedReader.readLine();
        }
        for ( i = 0; i<numbers.length; i++)
        {
        System.out.println(numbers[i]);
        }
        bufferedReader.close();

    }
}
