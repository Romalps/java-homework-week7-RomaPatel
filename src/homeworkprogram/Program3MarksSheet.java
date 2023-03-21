package homeworkprogram;

import java.util.Scanner;

/* 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 _______________________________
|                               |
| Mark Sheet                    |
|_______________________________|
| Name : Jay                    |
| Roll No : 08                  |
|_______________________________|
| Subjects : Marks              |
|_______________________________|
| Math : 98                     |
| Science : 90                  |
| English : 85                  |
|_______________________________|
| Total : 273                   |
|_______________________________|
| Percentage : 91.0             |
| Result : Pass                 |
| Grade : A+                    |
|_______________________________|
 */
public class Program3MarksSheet {

    public static void main(String[] args) {// main method
        // printing mark sheet's outline
        System.out.println("__________________________");
        System.out.println("|                         |");
        System.out.println("|       Mark Sheet        |");
        System.out.println("|_________________________|");
        Scanner scanner = new Scanner(System.in);// user input
        System.out.print("|   Name: ");
        String name = scanner.nextLine();
        //System.out.println("______________________|");
        int marks;
        System.out.print("|   Roll no: ");
        int rollNo = scanner.nextInt();
        System.out.println("|_________________________|");
        System.out.println("|    Subjects: Marks      |");
        System.out.println("|_________________________|");
        System.out.print("| Maths: ");
        int maths = scanner.nextInt();

        System.out.print("| Science: ");
        int science = scanner.nextInt();

        System.out.print("| English: ");
        int english = scanner.nextInt();
        System.out.println("|_________________________|");
        int total = maths + science + english;
        System.out.println("| Total: "+ total+"              |");
        System.out.println("|_________________________|");
        float percentage = (total * 100) / 300;
        System.out.println("| Percentage: " + percentage+"        |");
        scanner.close();
        if (percentage >= 35) {
            System.out.println("| Result: " + "Pass"+"            |");
        } else {
            System.out.println("| Result: " + "Fail"+"            |");
        }


        if (maths > 100 || science > 100 || english > 100) {

            System.out.println("Invalid input, marks should between 0 and 100");

        } else if (percentage >= 80) {
            System.out.println("| Grade: " + "A+"+"               |");
        } else if (percentage >= 60) {
            System.out.println("| Grade: " + "A"+"                |");
        } else if (percentage >= 50) {
            System.out.println("| Grade: " + "B"+"                |");
        } else if (percentage >= 35) {
            System.out.println("| Grade: " + "C"+"                |");
        }
        System.out.println("|_________________________|");
    }


}


