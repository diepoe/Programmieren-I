class Car {
    private static int version = 1;

    private int year;
    protected String model;

    /*
     * Car() {
     * System.out.println("CALLING DEFAULT CONSTRUCTOR");
     * }
     */

    Car(String modelParameter) {
        System.out.println("CALLING MODEL CONSTRUCTOR " + modelParameter);
        this.model = modelParameter;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static int getVersion() {
        return version;
    }

    void applyBrakes() {
        System.out.println("BRAKE!!!!");
    }
}

class SportCar extends Car {

    SportCar(String model) {
        super(model);
    }

}