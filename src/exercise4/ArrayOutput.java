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
         char space = ' ';
         int i = 0;
         while (i < name.length) {

           for (int counter = 0; counter < i; counter++) {
             System.out.print(space);
           }
         System.out.println(name[i]);
         i++;
        
    }

}
