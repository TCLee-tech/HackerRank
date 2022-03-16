import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        //%[argument_index$][flags][width][.precision]conversion
        Scanner sc = new Scanner(System.in);
        System.out.println("================================"); //this is println because there are no format specifiers.
        for (int i = 0; i< 3; i++) {
        String myString = sc.next();    // reading next token from input. token defined as unbroken sequence of non-whitespace characters.
        int myInt = sc.nextInt();   //reading next integer.
        System.out.printf("%-15s%03d%n", myString, myInt); //there should not be space in the format-string. Even a single space is considered one character.
        }
        System.out.println("================================");
        sc.close(); //close scanner to prevent resource leak
        
    }
}