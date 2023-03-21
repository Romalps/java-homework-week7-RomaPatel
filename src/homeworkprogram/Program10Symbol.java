package homeworkprogram;

import java.util.Scanner;

/*10. Write a java program to input any two number and ask user to enter their symbol (+, -,
        /, *) find addition, Subtraction, multiplication and division according to their symbol
        (using if else)
  */
public class Program10Symbol {

    public static void main(String[] args) {// main method
        Scanner s = new Scanner(System.in);//user input
        System.out.print("Input first number: ");
        int num1 = s.nextInt();

        System.out.print("Input second number: ");
        int num2 = s.nextInt();
        System.out.print(" Enter the symbol: ' + ', ' - ', ' / ', ' * ': ");
        char symbol = s.next().charAt(0);
        s.close();
        if(symbol == '+'){// according to  symbol performing the operations
            System.out.println("Addition : "+ (num1 + num2));
        } else if (symbol == '-') {
            System.out.println("Subtraction: "+ (num1-num2));
        } else if (symbol == '*') {
            System.out.println("Multiplication: " + (num1 * num2));
        } else if (symbol == '/') {
            System.out.println("Division: "+ (num1/num2));
        }
    }



}
