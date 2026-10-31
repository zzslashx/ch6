import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(convertToBinary(num));
    }

    public static String convertToBinary(int num) {
        String res = "";
        for (int i = num; i > 0; i = i / 2) {
            res = (i % 2) + res;
        }
        return res;
    }
}
