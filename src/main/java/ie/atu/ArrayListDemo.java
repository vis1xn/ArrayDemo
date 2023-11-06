package ie.atu;

import java.util.ArrayList;

import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {

    ArrayList<String> num = new ArrayList<String>();

    num.add("100");
    num.add("200");
    num.add("300");
    num.add("400");
    num.add("500");
    num.add("600");
    num.add("700");
    num.add("800");
    num.add("900");
    num.add("1000");

        int indVal = 0;
        for(string value: num) {
            System.out.println("Element at index " + indVal + ": " + value);
            indVal++;
        }
            System.out.println("Please enter another value: \n");
            Scanner inputs = new Scanner(System.in);
            int newNum = num.add;


    }
}
