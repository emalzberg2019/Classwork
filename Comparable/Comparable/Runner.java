
/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner
{
    public static void main(String[] args)
    {
    System.out.println("Motorcycle vs. Car: ");
    Motorcycle a = new Motorcycle();
    Car b = new Car();
    System.out.println(a.compareTo(b));
    System.out.println();
    
    System.out.println("Motorcycle vs. Truck: ");
    Motorcycle c = new Motorcycle();
    Truck d = new Truck();
    System.out.println(c.compareTo(d));
    System.out.println();
    
    System.out.println("Car vs. Truck: ");
    Car e = new Car();
    Truck f = new Truck();
    System.out.println(e.compareTo(f));
    System.out.println();
    
    System.out.println("Truck vs. Car: ");
    Car g = new Car();
    Truck h = new Truck();
    System.out.println(h.compareTo(g));
    System.out.println();
}
}
