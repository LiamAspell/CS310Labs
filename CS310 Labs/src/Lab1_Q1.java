
public class Lab1_Q1 {
	public static void main(String[] args) {
		String s = "helloWorlddlroWolleh";
		
		System.out.println("Palindrome : " +isPalindrome(s));
	}

	private static boolean isPalindrome(String s) {
		int x = s.length() -1;
		for(int i = 0; i < x; i++) {
			 if(s.charAt(i)!=s.charAt(x)) {
				return false;
			}
			 x--;
		}
		return true;
		
	}
}
