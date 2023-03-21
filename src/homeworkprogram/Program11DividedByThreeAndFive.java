package homeworkprogram;

import java.util.Scanner;

/* 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately.
 */
public class Program11DividedByThreeAndFive {

    public static void main(String[] args) {// main method
        System.out.println("Numbers between 1 to 100 which can be divided by 3: ");
        for (int i = 1; i <= 100; i++) {// checking the numbers between 1 and 100
            if (i % 3 == 0) {// number divided by 3 or not
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.println("Numbers between 1 to 100 which can be divided by 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {// number divided by 5 or not
                System.out.print(i + ", ");
            }

        }

    }

}
