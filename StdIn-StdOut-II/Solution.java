import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        sc.nextLine(); // Important, to get scanner to go to next line. See ** below.
        String c = sc.nextLine();
        
        System.out.println("String: " + c);     
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
        sc.close();
    }
}

/*
** Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
*/