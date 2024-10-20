// abstract bedeuted, dass aus der Being-Klasse kein Objekt direkt ohne Subclassing erstellt werden kann.

abstract class Being implements BeingInterface {
    // Attributes
    private String name;
    private String description;

    // Constructor
    public Being(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Methods
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void sleep() {
        System.out.println("Sleeeeeeeeeeeeeep");
    }
}