package homeworkprogram;
/*
19. Write a Java program to calculate the average value of array elements.
 */
public class Program19AverageOfArrayElements {

    public static void main(String[] args) {
        int array[]= {10,23,50,45,30,89};
        float sum =0;

        for (int i= 0; i<array.length;i++){
            sum= sum + array[i];

        }

        float average = (sum / array.length);
        System.out.println("The average of array elements: " + average);
    }
}
