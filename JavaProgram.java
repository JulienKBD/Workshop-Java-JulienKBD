


public class JavaProgram {
   public static void main(String args[]) {
      Vehicle vehicle1 = new Vehicle("Volkswagen", "Scirocco", 2008);
      Car car1 = new Car("Ferrari", "Testarossa", 1984, 1656, 4);
      Truck truck1 = new Truck("Scania", "Frostfire", 2022, 6000, 4);
      Motorcycle moto1 = new Motorcycle("Kwazaki", "Ninja", 2013, 170, 2);

      System.out.println();
      System.out.println("--------------------------------");
      System.out.println("# Exercice 1 output");
      System.out.println();

      vehicle1.describe();
      System.out.println();

      System.out.println("--------------------------------");
      System.out.println("# Exercice 2 output");
      System.out.println();

      car1.describe();
      System.out.println();

      truck1.describe();
      System.out.println();

      moto1.describe();
      System.out.println();

      System.out.println("--------------------------------");
      System.out.println();

      car1.accelerate("VROOOooooooom !");
      System.out.println();

      truck1.accelerate("broooooaaaaaAAAAAAARRRR !");
      System.out.println();

      moto1.accelerate("vrrrrRRRRRRRrrrrr !");
      System.out.println();
   }
}
