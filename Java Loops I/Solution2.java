import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        for (int i = 1; i < 11; i++) {

            /*
            Syntax for format specifiers:
            %[argument_index$][flags][width][precision]type

            %d - format specifier for integer type, %n - new line
            */  
            System.out.printf("%d x %d = %d%n", N, i, N*i);

        bufferedReader.close();
        }
    }
}

