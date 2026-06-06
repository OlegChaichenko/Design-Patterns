public class VolvoTrolleybus implements Trolleybus {

    public double getCost(int km) {
        return 7000000 + 13 * km;
    }
}