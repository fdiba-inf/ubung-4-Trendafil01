package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayReversal {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int size = input.nextInt();
    char [] letter = new char[size];

    for (int index = 0; index < letter.length; index++) {
      letter[index] = input.next().charAt(0);
    }

    char [] reverse = new char[size];
    int index = letter.length - 1;
    int address = 0;
    for (;index >= 0; index--){
      reverse[address] = letter[index];
      address++;
    }

    String charToString = Arrays.toString(reverse);
    System.out.println("Reversed symbols: " + charToString);
  }
} 
