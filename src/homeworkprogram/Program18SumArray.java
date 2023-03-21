package homeworkprogram;
/*
18. Write a Java program to sum values of an array
 */
public class Program18SumArray {

    public static void main(String[] args) {

        int array[]= {5,7,34,67,24,100,45};//initialize array
        int sum = 0;

        for (int i =0; i <array.length; i++){//loop to calculate array

            sum= sum + array[i];

        }
        System.out.println("sum of the array is: "+ sum);
    }
}
