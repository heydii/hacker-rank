package strongpassword;

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

class Result {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {

        int d = 0, uc = 0, lc = 0, sp = 0, req;
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(password.charAt(i))) {
                d = 1;
            } else if (Character.isUpperCase(password.charAt(i)))
                uc = 1;
            else if (Character.isLowerCase(password.charAt(i)))
                lc = 1;
            else
                sp = 1;
        }
        req = 4 - (d + uc + lc + sp);
        if (n + req < 6)
            return 6 - n;
        else
            return req;
    }

}

public class StrongPassword {
    public static void main(String[] args) throws IOException {
        Result.minimumNumber(3, "Ab1");
    }
}
