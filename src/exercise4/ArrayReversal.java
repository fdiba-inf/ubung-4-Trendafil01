package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = scanner.nextInt();
        char[] letters = new char[count];
        char[] letters2 = new char[count];
        int reverse = letters.lenght - 1;
        System.out.println("Enter letters: ");
        for (int i = 0; i < letters.length; i++) {
            letters[i] = scanner.next().charAt(0);
        }
        
        for (int i2=0;i2< kdi.length;i2++){
           letters2[i2] = letters[reverse];
           reverse--;
        }

      
        String lettersAsString = Arrays.toString(letters);
        System.out.println("Reversed symbols: " + letterssAsString);
        }
    }

}
