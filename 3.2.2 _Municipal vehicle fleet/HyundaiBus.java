public class HyundaiBus implements Bus {

    public double getCost(int km) {
        return 5500000 + 20 * km;
    }
}