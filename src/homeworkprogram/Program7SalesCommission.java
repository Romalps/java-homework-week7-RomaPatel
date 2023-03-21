package homeworkprogram;

import java.util.Scanner;

/* 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
*/
public class Program7SalesCommission {

    public static void main(String[] args) {// main method
        Scanner s = new Scanner(System.in);//user input
        System.out.print("Input sales id: ");
        int salesId = s.nextInt();

        System.out.print("Input seller's name: ");
        String name = s.next();

        System.out.print("Input sales amount: ");
        float amount = s.nextFloat();

        System.out.print("Input salary basic: ");
        float salary = s.nextFloat();
        s.close();

        float commission;
        if (amount >= 50000) {// checking sales amount and calculating the commission
            commission = (amount * 35) / 100;
            System.out.println(amount + " Sales Amount's 35% commission is: " + commission);
        } else if (amount >= 30000) {
            commission = (amount * 20) / 100;
            System.out.println(amount + " Sales Amount's 20% commission is: " + commission);
        } else if (amount >= 20000) {
            commission = (amount * 10) / 100;
            System.out.println(amount + " Sales Amount's 10% commission is: " + commission);
        } else if (amount >= 10000) {
            commission = (amount * 5) / 100;
            System.out.println(amount + " Sales Amount's 5% commission is: " + commission);
        } else if (amount < 10000) {
            commission = (amount * 2) / 100;
            System.out.println(amount + " Sales Amount's 2% commission is: " + commission);

        }
    }
}

