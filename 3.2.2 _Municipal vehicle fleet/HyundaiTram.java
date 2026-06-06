public class HyundaiTram implements Tram {

    public double getCost(int km) {
        return 9500000 + 6 * km;
    }
}