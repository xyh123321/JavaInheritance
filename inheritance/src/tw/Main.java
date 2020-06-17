package tw;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(5,50,true,true);
        System.out.println(tiger.toString());
        tiger.sound();
    }
}
