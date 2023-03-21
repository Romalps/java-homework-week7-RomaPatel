package homeworkprogram;
/*
20. Write a Java program to test if an array contains a specific value.
 */
public class Program20ArrayContainsSpecificValue {
    public static void main(String[] args) {
        int array[]={123,56,899,14,6554,10};

        int num =  899;
        for (int i= 0;i < array.length;i++){
            if(num == array[i]){
                System.out.println("Array contains the given value");
            }
        }
        System.out.println("Array doesn't contain the given value");
    }
}
