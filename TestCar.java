
/**
 * @author Seán Kelly (21421506)
 * @version 0.1.0
 */
public class TestCar
{
    public static void Main(String[] args) {
        
        System.out.println("------ BEGIN TEST SUITE 1 ------\n");
        testSuiteOne();
        System.out.println("------  END TEST SUITE 1  ------");
        
        System.out.println("------ BEGIN TEST SUITE 2 ------\n");
        testSuiteTwo();
        System.out.println("------  END TEST SUITE 2  ------");
        
        System.out.println("------ BEGIN TEST SUITE 3 ------\n");
        testSuiteThree();
        System.out.println("------  END TEST SUITE 3  ------");
    }
    
    public static void testSuiteOne() {
        // Instantiate 3 new objects, the car chassis, the engine and the wheels
        Car car = new Car("Nissan Micra");
        Engine engine = new Engine("V8", 200);
        Wheel wheel = new Wheel("Nissan Performance Wheel", 0.3302f);
        
        // Add the engine and wheels to the car and refuel the car
        car.add(engine);
        car.add(wheel);
        car.setFuel(100);
        
        System.out.printf("Current fuel: %.2f\n",car.getFuel());
        
        // Drive (rotating wheels & turning over engine) until out of fuel
        // Then print the state of the car (Mileage, etc.)
        // Then refuel by 50%
        car.drive();
        car.printState();
        car.setFuel(50);
        
        System.out.printf("Current fuel: %.2f\n", car.getFuel());
        
        // Repeat above
        car.drive();
        car.printState();
    }
    
    public static void testSuiteTwo() {
        // Instantiate 3 new objects, the car chassis, the engine and the wheels
        Car car = new Car("Toyota Corolla");
        Engine engine = new Engine("Wankle 3", 250);
        Wheel wheel = new Wheel("Michelin 30S", 0.567f);
        
        // Add the engine and wheels to the car and refuel the car
        car.add(engine);
        car.add(wheel);
        car.setFuel(75);
        
        System.out.printf("Current fuel: %.2f\n",car.getFuel());
        
        // Drive (rotating wheels & turning over engine) until out of fuel
        // Then print the state of the car (Mileage, etc.)
        // Then refuel by 50%
        car.drive();
        car.printState();
        car.setFuel(25);
        
        System.out.printf("Current fuel: %.2f\n", car.getFuel());
        
        // Repeat above
        car.drive();
        car.printState();
    }
    
    public static void testSuiteThree() {
        // Instantiate 3 new objects, the car chassis, the engine and the wheels
        Car car = new Car("Ford Focus");
        Engine engine = new Engine("Inline4", 350);
        Wheel wheel = new Wheel("Yokohama X3", 0.1605f);
        
        // Add the engine and wheels to the car and refuel the car
        car.add(engine);
        car.add(wheel);
        car.setFuel(80);
        
        System.out.printf("Current fuel: %.2f\n",car.getFuel());
        
        // Drive (rotating wheels & turning over engine) until out of fuel
        // Then print the state of the car (Mileage, etc.)
        // Then refuel by 50%
        car.drive();
        car.printState();
        car.setFuel(45);
        
        System.out.printf("Current fuel: %.2f\n", car.getFuel());
        
        // Repeat above
        car.drive();
        car.printState();
    }
}
