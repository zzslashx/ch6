
import java.util.Scanner;

public class PPAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type in the phrase: ");
        String phrase = scanner.nextLine();

        System.out.println(ppap(phrase));

       
    }

    public static String ppap(String str) {
		
        int comma = str.indexOf(",");
        String object1 = str.substring(9, comma);

        int second = str.lastIndexOf("I have an ");
        String object2 = str.substring(second+1 + 8);

        

        return "Uh! " + object2+object1;
    }
}
