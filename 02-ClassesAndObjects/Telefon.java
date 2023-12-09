public class Telefon {
    String phoneNumber;
    int battery;
    boolean isOn;
    void checkIfOn(){
        if (isOn == true){
            System.out.println("Phone is on");
        }
        else{
            System.out.println("Phone is off");
        }
    }
    void displayBattery(){
        System.out.println("Battery percentage is: "+battery);
    }
    
}
