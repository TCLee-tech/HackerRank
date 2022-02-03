import java.util.List;

class Solution1 {

    public static void main(String[] args) {
        List<String> upRight = List.of("1 4", "2 3", "4 1");
        System.out.println(countMax(upRight));
    }
    

public static long countMax(List<String> upRight) {
    return (long)getMinRow(upRight) * getMinCol(upRight);
}

private static int getMinRow(List<String> upRight) {
    int min = Integer.MAX_VALUE;

    for (String str : upRight) {
        String row = str.substring(0, str.indexOf(' ')); //select substring of first coordinate in a pair
        min = Math.min(min, Integer.parseInt(row));
    }

    return min;
}

private static int getMinCol(List<String> upRight) {
    int min = Integer.MAX_VALUE;

    for (String str : upRight) {
        String row = str.substring(str.indexOf(' ') + 1); //select substring of second coordinate in a pair
        min = Math.min(min, Integer.parseInt(row));
    }

    return min;
}


}