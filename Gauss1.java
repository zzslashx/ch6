public class gauss1 {
    public static double gauss(double x, int n) {
        double result = 0;
        double term = 1;           

        for (int i = 0; i < n; i++) {
            result += term;           
            term = term * (-x * x) / (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(gauss(1, 1));  
      
    }
}
