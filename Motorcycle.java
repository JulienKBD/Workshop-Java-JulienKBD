


class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String model, int year, int weight, int wheels) {
        super(brand, model, year);
        Weight = weight;
        Wheels = wheels;
    }

    public void describe() {
        System.out.println("I'm a " + Brand + " " + Model + " made in " + Year +".");
        System.out.println("I'm a Motorcycle, I weight " + Weight + " kg and I have " + Wheels + " wheels.");
    }
    public void accelerate(String Onoma) {
        System.out.print("My " + Brand + " goes like this : ");
        System.out.println(Onoma);
    }
}