public class SkodaTram implements Tram {

    public double getCost(int km) {
        return 9000000 + 8 * km;
    }
}