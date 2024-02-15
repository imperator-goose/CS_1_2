import java.util.Scanner;

public class CS_2_5 {

    public static double calculateTotalCost(double amount) {

        double discount = 0.0;

        if (amount >= 1000 && amount < 5000) {
            discount = 0.05;
        } else if (amount >= 5000) {
            discount = 0.10;
        }

        double discountWithAmount = amount - (amount * discount);

        return discountWithAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();


        System.out.println("Стоимость покупки с учетом скидки: " + calculateTotalCost(amount));
    }
}
