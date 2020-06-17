package tw;

public class Tiger extends Felidae{

    public Tiger(int age, int weight, boolean running, boolean eating) {
        super(age, weight, running, eating);
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "age=" + age +
                ", weight=" + weight +
                ", running=" + running +
                ", eating=" + eating +
                '}';
    }
}
