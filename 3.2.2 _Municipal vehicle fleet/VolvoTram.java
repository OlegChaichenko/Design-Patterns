public class VolvoTram implements Tram {

    public double getCost(int km) {
        return 10000000 + 7 * km;
    }
}