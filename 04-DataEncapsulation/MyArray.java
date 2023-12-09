public class MyArray {
    static int odd(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 1) {
                counter++;
            }
        }
        return counter;
    }

    static int above(int[] array) {
        float mean = 0;
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        mean = (float) sum / array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mean) {
                sum2 += array[i];
            }
        }
        return sum2;
    }
}
