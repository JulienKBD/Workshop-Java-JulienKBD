


public class Vehicle {
   String Brand;
   String Model;
   int Year;
   int Weight;
   int Wheels;

   public Vehicle(String brand, String model, int year) {
      Brand = brand;
      Model = model;
      Year = year;
   }

   public void accelerate() {
      System.out.print("I'm putting the pedal to the metal!");
   }
   public void brake() {
      System.out.println("Woah! Slow down boy!");
   }
   public void describe () {
      System.out.println("I'm a " + Brand + " " + Model + " made in " + Year +".");
      accelerate();
      System.out.println(" (Let's hope the car doesnt explode)");
   }
}
