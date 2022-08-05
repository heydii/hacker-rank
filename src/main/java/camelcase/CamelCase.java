package camelcase;

import java.io.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.reducing;

class Result {

    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
        // Write your code here

        int result = 1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                result++;
            }
        }
        return result;
    }
}

public class CamelCase {
    public static void main(String[] args) throws IOException {

        Result.camelcase("saveChangesInTheEditor");

    }
}

