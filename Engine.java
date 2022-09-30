
/**
 * @author Seán Kelly (21421506)
 * @version 0.1.0
 */
public class Engine
{
    // Instance Variables
    public String name;
    // turnsPerLitre represents fuel economy for the engine
    // and represents the number of wheel turns achieved per 'litre' of fuel
    private double turnsPerLitre;
    private double totalTurns = 0.00d;
    
    // Constructor
    public Engine(String name, double tpl) {
        this.name = name;
        this.turnsPerLitre = tpl;
    }
    
    // Finds the number of turns done with the remaining fuel
    // Adds it to totalTurns, representing the engine's lifetime turns
    // Then returns the distance travelled with the remaining fuel.
    public double run(double fuel, Wheel wheel) {
        double turns = fuel * turnsPerLitre;
        totalTurns += turns;

        return wheel.turn(turns);
    }
    
    // Returns the turnsPerLitre class variable
    public double getFuelEfficiency() {
        return this.turnsPerLitre;
    }
    
    // Returns the totalTurns class variable
    public double getTotalTurns() {
        return this.totalTurns;
    }
    
    // Sets the turnsPerLitre class variable
    public void setFuelEfficiency(double tpl) {
        this.turnsPerLitre = tpl;
    }
}
