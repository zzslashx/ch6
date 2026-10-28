public class Doubloon{
	public static void main(String[] args){
		System.out.println(isDoubloon("aabbcc"));
		}
	public static boolean isDoubloon(String s) {
    s = s.toLowerCase();

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        int count = 0;

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == c) {
                count++;
            }
        }

        if (count != 2) {
            return false;
        }
    }
    return true;
}
	
}
