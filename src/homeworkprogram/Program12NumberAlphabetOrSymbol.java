package homeworkprogram;

import java.util.Scanner;

/*  12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Program12NumberAlphabetOrSymbol {
    public static void main(String[] args) {// main method

        Scanner s = new Scanner(System.in);// user input
        System.out.print("Input 'number,' alphabet' or 'symbol': ");
        char value = s.next().charAt(0);
        s.close();

        if((value >= 'A' && value <= 'Z' )||(value >= 'a' && value <= 'z')){// checking input value is alphabet or not
            System.out.println(value + " is an alphabet");
        } else if (value >= '0' && value <= '9') {// checking input value is number or not
            System.out.println(value + " is a number");
        }
        else {// checking any other input accept number and alphabet
            System.out.println(value + " is a symbol");
        }


    }
}
