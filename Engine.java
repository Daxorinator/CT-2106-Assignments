
/**
 * Write a description of class Engine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Engine
{
    // Instance Variables
    public String name;
    private double turnsPerLitre;
    private double totalTurns = 0.00d;
    
    // Constructor
    public Engine(String name, double tpl) {
        this.name = name;
        this.turnsPerLitre = tpl;
    }
    
    public double run(double fuel, Wheel wheel) {
        double turns = fuel * turnsPerLitre;
        totalTurns += turns;

        return wheel.turn(turns);
    }
    
    public double getFuelEfficiency() {
        return this.turnsPerLitre;
    }
    
    public double getTotalTurns() {
        return this.totalTurns;
    }
    
    public void setFuelEfficiency(double tpl) {
        this.turnsPerLitre = tpl;
    }
}
