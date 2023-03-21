package homeworkprogram;

import java.util.Scanner;

/* 9. Input any alphabet from “A" to “F” and print their city name accordingly (use switch statement) if
any other alphabet should be invalid entry
  */
public class Program9PrintCityNameWithSwitchStatement {
    public static void main(String[] args) {//main method

        Scanner s = new Scanner(System.in);// user input
        System.out.print("Input any alphabet from 'A' to 'F' : ");
        char city = s.next().charAt(0);
        s.close();
        switch (city) {//according to alphabet printing the city name
            case 'A':
            case 'a':
                System.out.println("Amsterdam");
                break;
            case 'B':
            case 'b':
                System.out.println("Birmingham");
                break;
            case 'C':
            case 'c':
                System.out.println("Cambridge");
                break;
            case 'D':
            case 'd':
                System.out.println("Derby");
                break;
            case 'E':
            case 'e':
                System.out.println("Exeter");
                break;
            case 'F':
            case 'f':
                System.out.println("Florence");
                break;
            default:
                System.out.println("Invalid entry");

        }
    }
}
