package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {





         System.out.println(findMin(readElements(readInteger())));

	// write your code here
    }

    public static int readInteger(){

        int  number = scanner.nextInt();

        return number;


    }



    public static int[] readElements(int number){
        System.out.println("Enter " + number + "Values");
        int[] array = new int[number];
        for(int i = 0; i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int[] newarray = Arrays.copyOf(array,array.length);
        int temp = 0;
        int min = 0;
        boolean flagg = true;
        while(flagg){
            flagg = false;


            for(int i =0; i<newarray.length-1;i++){
                if(i==0) {
                    min = Math.min(newarray[i + 1], newarray[i]);
                }else{
                    temp = Math.min(newarray[i+1],newarray[i]);
                    min = Math.min(temp,newarray[i]);

                    flagg = true;
                }



            }

        }
        return min;
    }
}
