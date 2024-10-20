import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Greetable> list = new ArrayList<>();

        list.add(new Person("Alice"));
        list.add(new Dog("Buddy"));
        list.add(new Robot("T-800"));

        for (Greetable g : list) {
            System.out.println(g.greet());
        }
    }
}
