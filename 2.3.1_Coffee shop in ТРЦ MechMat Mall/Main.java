abstract class Drink {
    String name;
    double costPrice;
    double salePrice;

    public Drink(String name, double costPrice, double salePrice) {
        this.name = name;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public double getProfit() {
        return salePrice - costPrice;
    }

    public String getName() {
        return name;
    }
}

class Espresso extends Drink {
    public Espresso() {
        super("Espresso", 20, 45);
    }
}

class Americano extends Drink {
    public Americano() {
        super("Americano", 25, 55);
    }
}

class Cappuccino extends Drink {
    public Cappuccino() {
        super("Cappuccino", 35, 75);
    }
}

class Latte extends Drink {
    public Latte() {
        super("Latte", 40, 85);
    }
}

class Mocha extends Drink {
    public Mocha() {
        super("Mocha", 45, 95);
    }
}

class DrinkFactory {
    public Drink createDrink(String type) {
        switch (type) {
            case "espresso":
                return new Espresso();
            case "americano":
                return new Americano();
            case "cappuccino":
                return new Cappuccino();
            case "latte":
                return new Latte();
            case "mocha":
                return new Mocha();
            default:
                throw new IllegalArgumentException("Unknown drink: " + type);
        }
    }
}

class CoffeeShop {
    private DrinkFactory factory = new DrinkFactory();
    private double totalProfit = 0;

    public void sellDrink(String type, int count) {
        Drink drink = factory.createDrink(type);
        double profit = drink.getProfit() * count;
        totalProfit += profit;

        System.out.println(
                drink.getName() + " x" + count + " | profit: " + profit
        );
    }

    public void printTotalProfit() {
        System.out.println("Total profit: " + totalProfit);
    }
}

public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();

        coffeeShop.sellDrink("espresso", 10);
        coffeeShop.sellDrink("americano", 7);
        coffeeShop.sellDrink("cappuccino", 5);
        coffeeShop.sellDrink("latte", 4);

        // Розширений асортимент
        coffeeShop.sellDrink("mocha", 3);

        coffeeShop.printTotalProfit();
    }
}