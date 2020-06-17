package tw;

public class Felidae extends Animal{

    public Felidae(int age, int weight, boolean running, boolean eating) {
        super(age, weight, running, eating);
    }

    public void sound() {
        System.out.println("meowing meowing !");
    }
}
