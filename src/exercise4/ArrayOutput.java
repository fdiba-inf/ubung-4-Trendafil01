package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] numbers = new int[count];
       

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.println(numbers[0]);
        System.out.println(" " + numbers[1]);
        System.out.println(" " + " " + numbers[2]);
        System.out.println(" " + " " + " " + numbers[3]);
        System.out.println(" " + " " + " " + " " + numbers[4]);
    }

}
