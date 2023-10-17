public class KalkulatorWzrostu {
    public static void main(String[] args){
        int wzrost = 170;
        int feet = (int)(wzrost/30.48f);
        int inch = (int)((wzrost%30.48f) / 2.54f);
        System.out.println("i am "+feet+"\'"+inch);
    }
}
