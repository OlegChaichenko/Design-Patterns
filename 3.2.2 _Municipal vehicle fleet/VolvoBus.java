public class VolvoBus implements Bus {

    public double getCost(int km) {
        return 6000000 + 20 * km;
    }
}