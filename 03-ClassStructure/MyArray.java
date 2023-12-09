import java.util.Arrays;

public class MyArray {
    public static int even(int[] array) {
        int evenCount = 0;
        for (int each : array) {
            if (each % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    public static int positiveOdd(int[] array) {
        int positiveOddCount = 0;
        for (int each : array) {
            if (each > 0 && each % 2 == 1) {
                positiveOddCount++;
            }
        }
        return positiveOddCount;
    }

    public static int[] reverse(int[] array) {
        int[] reversed = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[j] = array[i];
            j++;
        }
        return reversed;
    }

    public static boolean compare(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }
}
