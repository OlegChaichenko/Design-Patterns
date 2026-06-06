public class SkodaTrolleybus implements Trolleybus {

    public double getCost(int km) {
        return 6800000 + 12 * km;
    }
}