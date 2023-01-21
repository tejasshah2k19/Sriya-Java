package stringd;

public class StringBufferDemo {

	public static void main(String[] args) {
		// StringBuffer and StringBuilder both are muttable class
		// so any operation we perform on it , it will change value of it.
		// not like string that it create new string on every operation

		// how to create StringBuffer?
		StringBuffer sb = new StringBuffer("royal");
		System.out.println(sb); // output is same as string
		sb.append("edu"); // append edu in sb
		System.out.println(sb); // royaledu

		System.out.println(sb.length());// 8
		System.out.println(sb.reverse());// udelayor

		StringBuffer sb1 = new StringBuffer("RoyalEducation");
		sb1.insert(5, " ");
		System.out.println(sb1);
		sb1.delete(6, 8);
		System.out.println(sb1);

		StringBuilder ssw = new StringBuilder();
		ssw.delete(0, 0);

		// StringBuffer and StringBuilder both are mutable and
		// both have same methods.

		// diff is StrinBuffer has all synchronized method
		// StringBuilder has non synchronized method

		//

	}
}
