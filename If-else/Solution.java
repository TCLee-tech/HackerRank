import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String [] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    /*
    Scanner is a class in java.util package used for obtaining the input of the primitive types like int, double, etc. and strings. 
    To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream. We may pass an object of class File if we want to read input from a file.
    */    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();    
    /*
    String input: String name = sc.nextLine();
    Character input:  char gender = sc.next().charAt(0);
    Number input:  double num = sc.nextDouble();    
    long mobileNo = sc.nextLong();
    */    

    if(n % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.println ("Not Weird");
            }
            if (n >= 6 && n <= 20) {
                System.out.println ("Weird");
            }
            if (n > 20) {
                System.out.println ("Not Weird");
            }
        }
    sc.close(); // closing Scanner to avoid resource leak
    }
}
