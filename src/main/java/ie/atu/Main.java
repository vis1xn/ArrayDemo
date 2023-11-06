package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array1;

        array1 = new  int[10];

        array1[0] = 100;
        array1[1] = 200;
        array1[2] = 300;
        array1[3] = 400;
        array1[4] = 500;
        array1[5] = 600;
        array1[6] = 700;
        array1[7] = 800;
        array1[8] = 900;
        array1[9] = 1000;

        int indVal = 0;
        for(int value: array1){
            System.out.println("Element at index " +indVal+ ": " + value);
            indVal++;
        }
    }
}
