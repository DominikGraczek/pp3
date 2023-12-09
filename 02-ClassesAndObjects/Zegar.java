public class Zegar {
    int hours;
    int minutes;

    void displayTime() {
        System.out.println("time: " + hours + ":" + minutes);
        System.err.println("minutes from midnight: " + ((hours * 60) + minutes));
        System.err.println("seconds from midnight: " + ((hours * 360) + minutes * 60));
    }
}
