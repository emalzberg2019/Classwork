
/**
 * Write a description of class Truck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Truck extends Vehicle
{
    private int numWindows;
    
    public Truck()
    {
       this(2, 45, 80, 8);
    }
    
    public Truck(int x, int y, int z, int a)
    {
        numWindows = x;
        setmpg(y);
        setmaxSpeed(z);
        setnumWheels(a);
    }
    
    public int getnumWindows()
    {
        return numWindows;
    }
}
