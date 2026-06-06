
import java.util.ArrayList;
import java.util.List;

public class Car {
    private Engine engine;
    private List<Wheel> wheels;

    public Car() {
        wheels = new ArrayList<>();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void addWheel(Wheel wheel) {
        wheels.add(wheel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}