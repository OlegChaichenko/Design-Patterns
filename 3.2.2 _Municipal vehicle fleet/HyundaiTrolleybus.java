public class HyundaiTrolleybus implements Trolleybus {

    public double getCost(int km) {
        return 7000000 + 11 * km;
    }
}