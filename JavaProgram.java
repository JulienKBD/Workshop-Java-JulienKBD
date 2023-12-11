


public class JavaProgram {
   public static void main(String args[]) {
      Vehicle vehicle1 = new Vehicle("Volkswagen", "Scirocco", 2008);
      vehicle1.describe();

      System.out.println();

      Truck truck1 = new Truck("Scania", "Frostfire", 2022, 6000, 4);
      truck1.describe();

      System.out.println();

      Motorcycle moto1 = new Motorcycle("Kwazaki", "Ninja", 2013, 170, 2);
      moto1.describe();
   }
}
