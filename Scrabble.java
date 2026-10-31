public class Scrabble{
	public static void main(String[] args){
		
		System.out.println(canSpell("aeceb","beeae"));
		
		}
	public static boolean canSpell(String str, String word){
		
		for (int i=0; i<word.length();i++){
			char s = word.charAt(i);
			for (int j=0;j<str.length();j++){
				if(str.charAt(j) == s) {
					str = str = str.substring(0, j) + str.substring(j + 1,str.length());
					break;
					}
				else if(j==str.length()-1) return false;
				}

			}
			return true;
		
		
		}
	
	
	
	}
