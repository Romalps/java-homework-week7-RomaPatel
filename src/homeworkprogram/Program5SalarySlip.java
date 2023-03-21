package homeworkprogram;

import java.util.Scanner;

/*  5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
|         Salary Slip          |
|______________________________|
| Employee Id      : 2564      |
| Employee Name    : Jay       |
|______________________________|
| Basic Salary     : 25000.0   |
| HRA 10%          : 2500.0    |
| TA 8%            : 2250.0    |
| DA 9%            : 2000.0    |
| PF - 20&         : 5000.0    |
|______________________________|
| Gross Salary     : 26750.0   |
|==============================|
 */
public class Program5SalarySlip {

    public static void main(String[] args) {// main method
        System.out.println("______________________________");// printing the salary slip outline
        System.out.println("|        Salary Slip         |");
        System.out.println("|____________________________|");
        Scanner scanner = new Scanner(System.in);// user input
        System.out.print("| Employee Id        : ");
        int empId = scanner.nextInt();
        System.out.print("| Employee Name      : ");
        String eName = scanner.next();
        System.out.println("|____________________________|");
        System.out.print("| Basic Salary   :  ");
        float salary = scanner.nextFloat();
        float hra = (salary * 10) / 100;// calculating HRA
        float da = (salary * 8) / 100;//calculating DA
        float ta = (salary * 9) / 100;//Calculating TA
        float pf = (salary * 20) / 100;//calculating PF
        float grossSalary = salary + hra + ta + da - pf;// Calculating gross salary
        System.out.println("| HRA 10%       :   " + hra + "   |");
        System.out.println("| TA 8%         :   " + ta + "    |");
        System.out.println("| DA 9%         :   " + da + "    |");
        System.out.println("| PF -20%       :   " + pf + "    |");
        System.out.println("|____________________________|");
        System.out.println("| Gross Salary  : " + grossSalary + "    |");
        System.out.println("|============================|");

        scanner.close();
    }

}
