package homeworkprogram;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/*  2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
 */
public class Program2LeapYear {

    public static void main(String[] args) {// main method
        Scanner scanner = new Scanner(System.in);// user input
        System.out.println("Input any year: ");
        int year = scanner.nextInt();// display the number
        scanner.close();

        if (year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {// checking the condition
            System.out.println(year + " is a leap year");// if condition is true then this message will print
        } else {
            System.out.println(year + " is not a leap year");// else condition is false then this message will print
        }
    }
}
