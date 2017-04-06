
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    private int numDoors;
    
    public Car()
    {
       this(4, 35, 85, 4);
    }
    
    public Car(int x, int y, int z, int a)
    {
        numDoors = x;
        setmpg(y);
        setmaxSpeed(z);
        setnumWheels(a);
    }
    
    public int getNumDoors()
    {
        return numDoors;
    }
    
    //accessors etc.
    //two constructors
}
