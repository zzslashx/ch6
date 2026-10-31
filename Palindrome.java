import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type a string to see if it is a palindrome or not: ");
		String input = scanner.nextLine();
		System.out.println(isPalindrome(input));
		}
	public static boolean isPalindrome(String str){
		String backwards ="";
		String nonLetters = ",.:;()[]{}!@#$%^&* ";
		String noSpace ="";
		str=str.toLowerCase();
		for (int i = str.length() - 1; i >= 0; i--) {
		if (!nonLetters.contains(String.valueOf(str.charAt(i)))) backwards += str.charAt(i);
		
			else continue;
			}
		for(int i=0; i<str.length();i++){
			if (!nonLetters.contains(String.valueOf(str.charAt(i)))) noSpace += str.charAt(i);
			}
		if(backwards.equals(noSpace)) return true;
		else return false;
		}

	
	}
