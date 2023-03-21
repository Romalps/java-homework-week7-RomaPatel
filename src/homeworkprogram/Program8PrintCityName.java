package homeworkprogram;

import java.util.Scanner;

/*  8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */
public class Program8PrintCityName {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input any alphabet from 'A' to 'F' : ");
        char city = s.next().charAt(0);
        s.close();

        if (city == 'A' || city == 'a') {
            System.out.println("Ahmadabad");

        } else if (city == 'B' || city == 'b') {
            System.out.println("Baroda");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Chennai");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Delhi");
        } else if (city == 'E'|| city == 'e') {
            System.out.println("Ecatepec");
        } else if (city == 'F'|| city== 'f') {
            System.out.println("Fukuoka");
        }
        else {
            System.out.println("Invalid entry");
        }

    }


}
