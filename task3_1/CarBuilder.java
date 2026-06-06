// CarBuilder.java
public class CarBuilder {

    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    public CarBuilder buildEngine(String type) {
        car.setEngine(new Engine(type));
        return this;
    }

    public CarBuilder buildWheels(int count, int size) {
        for (int i = 0; i < count; i++) {
            car.addWheel(new Wheel(size));
        }
        return this;
    }

    public Car getCar() {
        return car;
    }
}