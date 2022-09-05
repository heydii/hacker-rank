package caesarcipher;



class Result {

    private Result() {
        throw new IllegalStateException("Utility class");
    }

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here

        final int reducedK = k % 26;

        return s.chars()
                .mapToObj(ch -> {
                    if (ch < 65 || ch > 90 && ch < 97 || ch > 122) {
                        return (char) ch;
                    } else if ((ch + reducedK) > 90 && ch <= 90
                            || (ch + reducedK) > 122) {
                        return (char) ((ch + reducedK) - 26);
                    } else {
                        return (char) (ch + reducedK);
                    }
                })
                .map(Object::toString).reduce("", String::concat);
    }

}

public class CaesarCipher {
    public static void main(String[] args) {
        Result.caesarCipher("Ciphering.", 26);

    }
}

