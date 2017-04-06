
/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Vehicle implements Comparable<Vehicle>
{
    private int numWheels;
    private int maxSpeed;
    private int mpg;
    
    public int getmpg()
    {
        return mpg;
    }
    
    public int getmaxSpeed()
    {
        return maxSpeed;
    }
    
    public int getnumWheels()
    {
        return mpg;
    }
    
    public void setmpg(int x)
    {
        mpg = x;
    }
    
    public void setmaxSpeed(int y)
    {
        maxSpeed = y;
    }
    
    public void setnumWheels(int z)
    {
        numWheels = z;
    }
    
    public int compareTo(Vehicle y)
    {
        return this.mpg - y.mpg;
    }
    
}
