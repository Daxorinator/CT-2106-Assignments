
/**
 * Write a description of class TestCar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestCar
{
    public static void Main(String[] args) {
        Car car = new Car("Nissan Micra", 600);
        Engine engine = new Engine("V8", 200);
        Wheel wheel = new Wheel("Nissan Performance Wheel", 0.3302f);
        
        car.add(engine);
        car.add(wheel);
        car.setFuel(100);
        
        System.out.printf("Current fuel: %.2f\n",car.getFuel());
        
        car.drive();
        car.printState();
        car.setFuel(50);
        
        System.out.printf("Current fuel: %.2f\n", car.getFuel());
        
        car.drive();
        car.printState();
    }
}
