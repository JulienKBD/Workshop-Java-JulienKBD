


public class Vehicle {
   protected String Brand;
   protected String Model;
   protected int Year;
   protected int Weight;
   protected int Wheels;

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
   public void setBrand(String newBrand) {
      Brand = newBrand;
   }
   public void setModel(String newModel) {
      Model = newModel;
   }
   public void setYear(int newYear) {
      Year = newYear;
   }
   public void setWeight(int newWeight) {
      Weight = newWeight;
   }
   public void setWheels(int newWheels) {
      Wheels = newWheels;
   }
   public String getBrand() {
      return Brand;
   }
   public String getModel() {
      return Model;
   }
   public int getYear() {
      return Year;
   }
   public int getWeight() {
      return Weight;
   }
   public int getWheels() {
      return Wheels;
   }
}
