package homeworkprogram;

import java.util.Scanner;

/*
6. Write a java program to input any number and find out if it’s odd or even
 */
public class Program6OddAndEven {
    public static void main(String[] args) {// main method


        Scanner s = new Scanner(System.in);
        System.out.println("Input any number: ");//user input
        int number = s.nextInt();
        s.close();

        if( number % 2 == 0){// checking  input number is divisible by two or not
            System.out.println("It's even");
        }
        else {
            System.out.println("It's odd");
        }

    }
}