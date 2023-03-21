package homeworkprogram;

import java.util.Scanner;

/*  16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”
 */
public class Program16PositiveNegativeZero {

    public static void checkingNumber(int number){//static method
        if (number >0)// checking entered number is bigger than zero
        {
            System.out.println(number + " is a POSITIVE number");
        } else if (number < 0) {// checking entered number is smaller than zero
            System.out.println(number + " is a NEGATIVE number");
        }
        else if (number == 0){// checking entered number is zero
            System.out.println( "Entered number is a ZERO");
        }

    }

    public static void main(String[] args) {// main method
        Scanner s = new Scanner(System.in);//user input
        System.out.print("Enter the number: ");
        int number = s.nextInt();
        checkingNumber(number);// calling static method
    }
}
