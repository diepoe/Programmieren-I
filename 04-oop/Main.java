class Main {
    public static void main(String[] args) {
        // Car car = new Car();
        // System.out.println(car.year);
        // car.applyBrakes();

        Car mercedes = new Car("Mercedes Benz");
        Car bmw = new Car("BMW");
        SportCar z4 = new SportCar("BMW z4");

        // mercedes.model = "Mercedes";
        // bmw.model = "BMW";

        mercedes.setYear(1890);

        System.out.println(mercedes.getModel() + " " + mercedes.getYear());
        System.out.println(bmw.getModel() + " " + bmw.getYear());
        
        System.out.println(z4.getModel());
        z4.applyBrakes();
    }
}