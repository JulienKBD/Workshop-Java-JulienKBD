


class Car extends Vehicle {
    public Car(String brand, String model, int year, int weight, int wheels) {
        super(brand, model, year);
        Weight = weight;
        Wheels = wheels;
    }

    public void describe() {
        System.out.println("I'm a " + Brand + " " + Model + " made in " + Year +".");
        System.out.println("I'm a Car, I weight " + Weight + " kg and I have " + Wheels + " wheels.");
    }
}
