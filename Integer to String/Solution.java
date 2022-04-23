import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();

        String s = Integer.toString(n); 
        /*
        option 2: 
        String s = String.valueOf(n);
        
        option 3: 
        String s = "" + n;   
        explanation: "" is empty string. It is a String with no characters inside. 
        "+" operator connects whatever is on the right to empty String. 
        If whatever is being connected is not yet a String, it will be converted into a String.
        */

        if (s != null && s.matches("^[+-]?\\d+$"))   
        /*
        ^ means start of string
        $ means end of string 
        [+-] means positive or negative sign
        ? means occuring zero or one time 
        \\d+ first \ is to escape, \d means digit, + means occuring one or more times
        */
        
        {
        System.out.println("Good job");
        } else {
        System.out.println("Wrong answer");    
        }
        sc.close();
    }
}