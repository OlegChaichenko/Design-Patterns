
public class CarSimulator {

    private CarBuilder builder;

    public CarSimulator() {
        builder = new CarBuilder();
    }

    public Car createCar() {
        return builder
                .buildEngine("V8")
                .buildWheels(4, 18)
                .getCar();
    }

    public static void main(String[] args) {
        CarSimulator simulator = new CarSimulator();

        Car car = simulator.createCar();

        System.out.println(car);
    }
}