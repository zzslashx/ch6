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

        if (n < 0) return Math.sqrt(-1);      
        if (n == 0)  return 0;
        
        double x0 = n / 2.0;            
        double x1 = (x0 + n / x0) / 2.0;  
        while (Math.abs(x1 - x0) >= 0.001) {
            x0 = x1;
            x1 = (x0 + n / x0) / 2.0;
        }
        return x1;
    }
}
