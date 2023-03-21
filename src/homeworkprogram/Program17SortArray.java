package homeworkprogram;

import java.util.Arrays;

/*
17. Write a Java program to sort a numeric array and a string array.
 */
public class Program17SortArray {
    public static void main(String[] args) {
    int array1[] = { 89,562,8561,-12,7894,650,25,32145,-985,144,250,8500,960,-9100,34587,5,-46};

    String array2[]= {"Akta","Sweta","Khushi","Ishita","Dhara","Jigna","Hardik","Hitesh","Alka","Hiral","Bhavika","Parul","Tejal"};

        Arrays.toString(array1);// returns a string representation of array1
        Arrays.toString(array2);// returns a string representation of array2


        System.out.println("Original numeric array1 :" + Arrays.toString(array1));
        System.out.println("Original string array2: "+Arrays.toString(array2));

        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println();
        System.out.println("Sorted numeric array1 :" + Arrays.toString(array1));
        System.out.println("Sorted string array2: "+Arrays.toString(array2));
    }

}
