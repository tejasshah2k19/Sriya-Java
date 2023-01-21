package stringd;

public class StringImmutable {

	public static void main(String[] args) {
		// String is immutable
		String s = "royal";

		s.concat("edu");
		System.out.println(s);

		String x = "    roy al   ";
		System.out.println(x.length());

		String y = x.trim();
		System.out.println(y.length());
		System.out.println(y);

		String s1 = "this is the example of string";
		System.out.println(s1.replace('t', 'T'));
		System.out.println(s1.replace("this", "THis"));

		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5, 15));// 5-14
		// StringBuffer
		// StringBuilder

		// hey this is java
		// 4,7 -> thi
	}
}
