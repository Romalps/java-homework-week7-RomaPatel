package homeworkprogram;

import java.util.Scanner;

/*  1. Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
 */
public class Program1OddOrEvenUsingTernaryOperator {

    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);//user input
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        scanner.close();
        String result = number % 2 == 0 ? "Even" : "Odd";// check the condition
        System.out.println("Input number " + number + " is " + result);// print this message with 'Even' or 'odd'
    }

}
