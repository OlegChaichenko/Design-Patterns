public class SkodaBus implements Bus {

    public double getCost(int km) {
        return 4500000 + 25 * km;
    }
}