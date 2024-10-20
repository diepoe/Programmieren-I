import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManagment {

    public void manageStudents() {
        HashMap<String, List<Student>> map = new HashMap<String, List<Student>>();

        List<Student> freshman = new ArrayList<Student>();
        freshman.add(new Student("Alice", 18, "S001"));
        freshman.add(new Student("Bob", 19, "S002"));
        map.put("Freshman", freshman);

        List<Student> sophomore = new ArrayList<Student>();
        sophomore.add(new Student("Charlie", 20, "S003"));
        map.put("Sophomore", sophomore);

        List<Student> junior = new ArrayList<Student>();
        junior.add(new Student("David", 21, "S004"));
        junior.add(new Student("Eva", 22, "S005"));
        map.put("Junior", junior);

        for (Map.Entry<String, List<Student>> e : map.entrySet()) {
            System.out.print(e.getKey() + ": | ");

            for (Student s : e.getValue()) {
                System.out.print(s.getName() + " | ");
            }
            System.out.println();
        }
    }
}

class Student {

    private String name;
    private int age;
    private String id;

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

}