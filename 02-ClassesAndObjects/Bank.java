public class Bank {
    float buy;
    float sell;
    float spread;

    void displaySpread() {
        System.out.printf("Spread is:  %.4f", sell - buy);

    }
}
