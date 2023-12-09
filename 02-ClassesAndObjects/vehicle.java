public class vehicle {
    int speed;
    void checkSpeed() {
        if (speed >= 40 && speed <= 140) {
            System.out.println("Speed is valid: True");
        } else {
            System.out.println("Speed is valid: False");
        }
    }
}
