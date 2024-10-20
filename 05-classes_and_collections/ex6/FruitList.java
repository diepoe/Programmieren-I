import java.util.ArrayList;

public class FruitList {
    public void createFruitList() {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
