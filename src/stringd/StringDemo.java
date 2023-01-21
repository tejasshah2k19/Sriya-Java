package stringd;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "royal";
		String s2 = "royal";
		String s3 = new String("royal");
		System.out.println(s1 == s2); // s1 and s2 refer same reference
		System.out.println(s1 == s3); // s1 and s3 refer different reference
		// in object == will check reference

		// how we can check value of string? for compare
		// equals() - is used to compare two string - with value
		// compareTo() - is used to compare two string - with value

		System.out.println("equals()");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));

		System.out.println("===methods()============");
		System.out.println("Length => " + s1.length());
		System.out.println("Upper => " + s1.toUpperCase());
		System.out.println("Lower => " + s1.toLowerCase());
		System.out.println("charAt => " + s1.charAt(0)); // royal 0:r 1:o 2:y ...
//		System.out.println("charAt => "+s1.charAt(7)); // royal 0:r 1:o 2:y ...
		System.out.println("indexOf => " + s1.indexOf('l'));// 4

		String s4 = "jony jony yes papa";
		System.out.println("indexOf => " + s4.indexOf('j'));// 0
		System.out.println("lastIndexOf => " + s4.lastIndexOf('j'));// 5
		System.out.println("indexOf => " + s4.indexOf('z'));// -1

		String data[] = s4.split(" ");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

		for (String x : data) {
			System.out.println(x);
		}
	}

}
