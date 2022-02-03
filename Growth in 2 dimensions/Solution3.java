import java.util.function.ToIntFunction;

import java.util.List;

class Solution3 {

    public static void main(String[] args) {
        List<String> upRight = List.of("2 4", "2 3", "4 2");
        System.out.println(countMax(upRight));
    }    


    public static long countMax(List<String> upRight) {

        //instantiate ToIntFunction
        
        //str is the only argument as input
        //produces an integer as output
        ToIntFunction<String> getRow =
                str -> Integer.parseInt(str.substring(0, str.indexOf(' '))); //lambda expression assigned to object of ToIntFunction type
                                                                             //this lambda expression defines the applyAsInt() method   
                ToIntFunction<String> getCol =
                str -> Integer.parseInt(str.substring(str.indexOf(' ') + 1));
        ToIntFunction<ToIntFunction<String>> getMin =
                getValue -> upRight.stream().mapToInt(getValue).min().orElse(0);

        int minRow = getMin.applyAsInt(getRow);
        int minCol = getMin.applyAsInt(getCol);
        return (long)minRow * minCol;
    }
    
}

/*
Reference:
Java Lambda - ToIntFunction example
http://www.java2s.com/Tutorials/Java/java.util.function/ToIntFunction/index.htm
ToIntFunction interface in Java with examples
https://www.geeksforgeeks.org/tointfunction-interface-in-java-with-examples/

Stream<t> interface
https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/stream/Stream.html
Stream in Java
https://www.geeksforgeeks.org/stream-in-java/

*/