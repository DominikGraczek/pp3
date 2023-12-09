public class Statistics {
    int counter;
    int suma;
    float srednia;

    String MojeStaty(int x, int y) {
        for (int i = x; i <= y; i++) {
            counter += 1;
            suma += i;
        }
        srednia = (float) suma / counter;
        return "Number of items within the specified range <x,y> is " + counter +
                " Sum of numbers in the given range  <x,y> is " + suma
                + " Arithmetic mean of the numbers in the given range  is " +
                srednia;
    }

}
