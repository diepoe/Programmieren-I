class Person implements Greetable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String greet() {
        return "Hello, my name is " + this.name;
    }

}

class Dog implements Greetable {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String greet() {
        return "Woof, I'm " + this.name + " the dog.";
    }
}

class Robot implements Greetable {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String greet() {
        return "Beep boop! I am model " + this.name + " robot.";
    }
}
