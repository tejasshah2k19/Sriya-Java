package stringd;

public class Palindrome {

	public static void main(String[] args) {
		String x = "royal";
		StringBuffer sb = new StringBuffer("royal");

		System.out.println(x.equals(sb));

		String str = sb.toString();// StringBuffer into String

		// palindrome

//		String mystr = "royal";
		String mystr = "racecar";
		StringBuffer sb1 = new StringBuffer(mystr);
		String rev = sb1.reverse().toString();
		System.out.println(mystr.equals(rev));
		// StringBuffer => Synchronize
		// StringBuilder => no
	}
}
