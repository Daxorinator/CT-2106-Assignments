
/**
 * @author Seán Kelly (21421506)
 * @version 0.1.0
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
        
        // Calculate the wheel circumference based on the circumference formula
        this.wheelCircumference = 2 * Math.PI * wheelRadius;
    }
    
    // Returns the wheel radius class variable
    public float getWheelRadius() {
        return this.wheelRadius;
    }
    
    // Returns the wheel circumference class variable
    public double getWheelCircumference() {
        return this.wheelCircumference;
    }
    
    // Returns the distance travelled by the wheel in X turns
    public double turn(double turns) {
        return turns * wheelCircumference;
    }
    
    // Returns the number of turns required to travel a distance
    public double turnsRequired(double distance) {
        return distance / wheelCircumference;
    }
}
