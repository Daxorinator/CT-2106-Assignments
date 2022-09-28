
/**
 * Write a description of class Wheel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wheel
{
    // Instance Variables
    public String name;
    private float wheelRadius;
    private double wheelCircumference;

    // Constructor
    public Wheel(String name, float radius) {
        this.name = name;
        this.wheelRadius = radius;
        this.wheelCircumference = 2 * Math.PI * wheelRadius;
    }
    
    public float getWheelRadius() {
        return this.wheelRadius;
    }
    
    public double getWheelCircumference() {
        return this.wheelCircumference;
    }
    
    public double turn(double turns) {
        return turns * wheelCircumference;
    }
    
    public double turnsRequired(double distance) {
        return distance / wheelCircumference;
    }
}
