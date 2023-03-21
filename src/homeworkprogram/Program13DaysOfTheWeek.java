package homeworkprogram;

import java.util.Scanner;

/*13. Write a Java program which input any number between 1 to 7 and it print The Days
        name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
        NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Program13DaysOfTheWeek {
    public static void main(String[] args) {// main method
        Scanner s = new Scanner(System.in);// user input
        System.out.print("Enter any number between 1 and 7: ");
        int number = s.nextInt();
        s.close();
        week(number);// calling static method
    }

    public static void week(int number) {// static method

        switch (number) {// print the days name with switch statement
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");

        }

    }
}
