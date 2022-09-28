
/**
 * @author Seán Kelly (21421506)
 * @version 0.1.0
 */
public class Car
{
    // Instance variables
    public String carName;
    
    // Cars need an engine and wheels
    // Wheels are part of car not engine so that they can be swapped to customer needs
    // Private modifier used so they can't be swapped on the sly.
    private Engine engine;
    private Wheel wheel;
    
    // No clocking on these cars ;) (Mileage is private and must be adjusted with the setter)
    private double mileage = 0.00d;
    private double tripOdometer = 0.00d;
    
    // Fuel level is included in the car class to
    // allow for custom fuel tank sizes.
    // We also don't siphon fuel around these parts.
    private double fuelTank = 0.00d;
    
    // Car constructor builds a car based on name, distance required, an engine, wheels and a fuel tank size.
    // These can all be modified later by setter functions and private variables retrieved with respective getters.
    public Car(String name, double distance)
    {
        this.carName = name;
        this.tripOdometer = distance;
        this.engine = engine;
        this.wheel = wheel;
    }
    
    public void drive() {
        tripOdometer = engine.run(fuelTank, wheel);
        mileage += tripOdometer;
        fuelTank = 0.00d;
    }
    
    public void printState() {
        System.out.printf("Configuration: \n");
        
        System.out.printf("\tCar Body: %s \n", carName);
        
        System.out.printf("\tCar Engine: %s \n", engine.name);
        System.out.printf("\tEngine efficiency: %.2f turns per litre \n", engine.getFuelEfficiency());
        System.out.printf("\tEngine total turn count: %.2f turns \n", engine.getTotalTurns());
        
        System.out.printf("\tCar Wheels: %s \n", wheel.name);
        System.out.printf("\tWheel Radius: %.2f \n", wheel.getWheelRadius());
        System.out.printf("\tWheel circumference: %.2f \n", wheel.getWheelCircumference());
        
        System.out.printf("Distance this trip: %.2f \n", tripOdometer);
        System.out.printf("Car mileage: %.2f \n", mileage);
        
        System.out.printf("Current fuel level: %.2f \n", fuelTank);
        
        System.out.printf("\n\n");
    }
    
    // All getters and setters for various private components
    // E.g. Engine, Wheels, Mileage, Fuel Level, Fuel tank size, etc.
    public Engine getEngine() {
        return this.engine;
    }
    
    public Wheel getWheel() {
        return this.wheel;
    }
    
    public double getMileage() {
        return this.mileage;
    }
    
    public double getFuel() {
        return this.fuelTank;
    }
    
    public void add(Engine engine) {
        this.engine = engine;
    }
    
    public void add(Wheel wheel) {
        this.wheel = wheel;
    }
    
    public void setFuel(int newFuelLevel) {
        this.fuelTank = newFuelLevel;
    }
}
