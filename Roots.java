import java.util.Scanner;
public class Roots {
    public static void main(String[] args) {
        double sqrt = squareRoot();
        System.out.println(sqrt);
    }
    public static double squareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number >= 0");
        double n = scanner.nextDouble();
        double difference = 100;
        double x0 = n / 2 / 0;
        double x1 = (x0 + n / 2.0);
        double x2 = 0;
        while (difference >= 0.001) {
            x1 = (x0 + n / x0) / 2.0;
            x2 = (x1 + n / x1) / 2.0;
            x0 = x0 = (x2 + n / x2) / 2.0;
            x1 = (x0 + n / x0) / 2.0;

            difference = Math.abs(x1 - x0);
        }
        return x1;
    }
}
