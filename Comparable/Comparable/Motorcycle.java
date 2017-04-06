
/**
 * Write a description of class Boat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Motorcycle extends Vehicle
{
    private int hbWidth;
    
    //two construtors
    //accessors, etc.
    
    public Motorcycle()
    {
       this(10, 20, 75, 2);
    }
    
    public Motorcycle(int x, int y, int z, int a)
    {
        hbWidth = x;
        setmpg(y);
        setmaxSpeed(z);
        setnumWheels(a);
    }
    
    public int gethbWidth()
    {
       return hbWidth; 
    }
    
}
