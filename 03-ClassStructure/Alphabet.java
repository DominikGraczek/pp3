import java.util.Arrays;

public class Alphabet {
    static boolean isAlphabet(String t) {
        char arr[] = t.toCharArray();
        Arrays.sort(arr);
        String x = new String(arr);
        if (x.equals(t)) {
            return true;
        } else {
            return false;
        }
    }
}
