public class Palindrome{
	public static void main(String[] args){
		
		
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
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
