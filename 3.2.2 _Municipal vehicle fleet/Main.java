public class Main {

    public static void main(String[] args) {

        int A = 10;
        int T = 5;
        int Tr = 7;
        int N = 100000;

        calculate("Volvo", new VolvoFactory(), A, T, Tr, N);
        calculate("Skoda", new SkodaFactory(), A, T, Tr, N);
        calculate("Hyundai", new HyundaiFactory(), A, T, Tr, N);
    }

    private static void calculate(String brand,
                                  TransportFactory factory,
                                  int a,
                                  int t,
                                  int tr,
                                  int km) {

        double total =
                a * factory.createBus().getCost(km) +
                        t * factory.createTram().getCost(km) +
                        tr * factory.createTrolleybus().getCost(km);

        System.out.println(brand + " = " + total + " грн");
    }
}