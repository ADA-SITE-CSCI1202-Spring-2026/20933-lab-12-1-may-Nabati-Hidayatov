
@FunctionalInterface
interface DiscountCalculator {
    double calculate(double price);
}

public class DiscountDemo {
    public static void main(String[] args) {

        DiscountCalculator discount10 = price -> price * 0.9;
        DiscountCalculator discount25 = price -> price * 0.75;

        double price = 100;

        System.out.println(discount10.calculate(price));
        System.out.println(discount25.calculate(price));
    }
}
